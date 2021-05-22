package day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays + size = " + getDays().size());
        System.out.println("getDays + get = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");
        System.out.println("dayNames = " + dayNames);
        dayNames.removeIf(day -> day.length()==6);
        System.out.println("dayNames after removeIf = " + dayNames);
        //System.nanoTime(); is used to capture nanoseconds of code execution
        //- removeIf(); method in ArrayList
        //List<Integer> nums = new ArrayList<>();
        //nums.add(10);
        //-||- u can add as much numbers you want
        //nums.removeIf(n -> n > 10); removeIf very flexible
        //nums.removeIf(n -> n % 2 != 0); // remove all odd numbers
        List<Integer> nums = getRandomList(100);
        System.out.println(getRandomList(10));
        System.out.println(nums.size());
        System.out.println(nums);
        nums.removeIf(n -> n < 90);// lamda expression
        System.out.println(nums);
    }

    public static List<String> getDays(){
        List<String>days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday",
                "Friday","Saturday","Sunday"));
        return days;
    }

    public static List<Integer> getRandomList(int size){

        Random random = new Random();
        List<Integer> randomNums = new ArrayList<>();
        for(int i = 1; i <= size; i++){

            randomNums.add(random.nextInt(101));// generate random 0-100 limit number
        }
        return randomNums;
    }

}
