import java.util.Random;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(walk(15, 25));
        System.out.println(walk(25, -25));
        System.out.println(walk(55, 35));
        System.out.println(walk(22, 15));
        System.out.println(walk(16, 18));
        System.out.println(walk(generateRandomAge(),44));
    }
    public static String walk ( int age, int temperature){
        String go = " Можно идти гулять";
        String goTo = " Оставайтесь дома";
        if (age >= 20 && age <=45 && temperature >=-20 && temperature <=30) {
            return go;
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return go;
        }   else if (age >45 && temperature >= -10 && temperature <= 25) {
            return go;
        } else {
            return goTo;

        }


    }
    public static int generateRandomAge(){
        Random random=new Random();
        int age=random.nextInt(100);
        return age;
    }
        }




