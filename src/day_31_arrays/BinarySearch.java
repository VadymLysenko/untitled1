package day_31_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {-5, 23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23)); // will print index of 1
        System.out.println(Arrays.binarySearch(nums, 2344)); // will print index of 4
        System.out.println(Arrays.binarySearch(nums, 25 )); // -3 we will get
        System.out.println(Arrays.binarySearch(nums, 700)); // -5
        System.out.println(Arrays.binarySearch(nums, -5)); // 0

        //check if number 12345 is among number in array
        if(Arrays.binarySearch(nums,12345) >= 0){
            System.out.println("12345 is present in array");
        }else{
            System.out.println("12345 not present");
        }

    }
}
