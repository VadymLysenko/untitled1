package day_40_arraylist;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); // Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(3);
        nums.add(5);
        nums.add(15);
        nums.add(345);
        nums.add(234);
        nums.add(123);
        System.out.println("size = " + nums.size());
        System.out.println("nums = " + nums);

        nums.remove(0);// you can remove it by index
        System.out.println("nums = " + nums);

        nums.remove(new Integer(15));// you can remove by calling Integer and number in ();
        System.out.println("nums = " + nums);

        // for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        //for each loop, and print all in the same line
        for(int each : nums){
            System.out.print(each + " ");
        }
        System.out.println();
    }
}