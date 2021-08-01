package day_100_practice_my_own;

import java.lang.reflect.Array;

public class Array_FindMaxNum {
    public static void main(String[] args) {
        System.out.println(Integer.max(5,3));
    }

    public int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;

        for(int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}
