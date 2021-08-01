package day_100_practice_my_own;

import java.util.Arrays;

public class Fibonacci2 {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
    public static String fib(int num){
        int [] arr = new int[num+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr [i-2];
        }
        return Arrays.toString(arr);
    }
}
