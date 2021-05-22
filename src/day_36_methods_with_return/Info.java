package day_36_methods_with_return;
import java.util.*;
public class Info {

    public static void main(String[] args) {
        System.out.println("name = " + fullNmae());
        System.out.println("isMarried = " + isMarried());
        System.out.println("age is = " + getAge());
        System.out.println("i was born long time ago = " + getRandomYear() + " A.D.");

        String name = fullNmae();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

    }
    public static String fullNmae(){
        //System.out.println("inside fullname method");
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        int age = 35;
        return age;
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
