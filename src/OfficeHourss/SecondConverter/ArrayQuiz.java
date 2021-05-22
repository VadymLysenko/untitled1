package OfficeHourss.SecondConverter;

import java.util.Arrays;

public class ArrayQuiz {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        a = b;

        System.out.println(a);

        int [] n = {3,1,3};
        int [] n2 = {3,1};
        n = n2;
        System.out.println(Arrays.toString(n));
    }
}
