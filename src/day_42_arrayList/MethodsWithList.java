package day_42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {

    public static void main(String[] args) {
        //declare string arraylist and add values
        List<String> words = new ArrayList<>();
        words.add("java");words.add("html");words.add("selenium");
        printStrList(words);
        printStrList(Arrays.asList("select","option","br","python","sql","api"));
        System.out.println(sumIntegerList(Arrays.asList(2,3,4,5,6,7,8,9)));
        /**
         *
         methodName: printStrList
         param: List of Strings
         return: void
         prints all values separated by space in same line
         */

    }
    public static void printStrList (List<String> stringList){
        for(String str : stringList){
            System.out.print(str+" ");
        }
        System.out.println();
    }
    public static int sumIntegerList(List<Integer>nums) {
        int sum=0;
        for(int each:nums){
            sum+=each;

        }
        return sum;

    }

}
