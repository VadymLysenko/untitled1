package OfficeHourss.Practice_04_19_2021;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int [] a = getRandonIntArray(10, 500);
        System.out.println(Arrays.toString(a));
    }

    public static int [] getRandonIntArray(int size, int maxRandomNumber){

        Random random = new Random();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(maxRandomNumber+1);
        }
        return arr;


    }

}
