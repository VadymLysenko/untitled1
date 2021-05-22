package day_43_list_custom_classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithReturn {

    public static void main(String[] args) {
        // 1 nano second == 1_000_000_000 --> of a second
        long start = System.nanoTime();
        List<Integer> mlnNums = getIntegerList();// returns ready ArrayList object. no need new ArrayList...
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));
        //System.out.println(mlnNums);
        //System.out.println(getIntegerList());
        long sta = System.nanoTime();
        int [] arr = getIntArray();
        long en = System.nanoTime();
        System.out.println("Array time = " + (en-sta));



    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            nums.add(i);
        }
        return nums;
    }
    public static int [] getIntArray(){
        int []nums = new int[1_000_001];
        for(int i = 0; i <= 1000000; i++){
          nums[i] = i;

        }
        return nums;
    }

}

