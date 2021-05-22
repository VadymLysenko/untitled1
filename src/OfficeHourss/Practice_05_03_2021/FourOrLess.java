package OfficeHourss.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourOrLess {

    public static void main(String[] args) {

        // remove in ArrayList
        // remove(0) --> removes indexes and moves them up to 1 more index

        // 1 2 3 remove(0) --> 2 3 --> have to be careful may cause problem with last index

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "java", "tree", "cat", "animal", "shortcut"));

        ArrayList<String> list2 = new ArrayList<>();

        for(String each : list){

            if(each.length() <= 4){
                list2.add(each);
            }
        }
        System.out.println(list2);
    }
}
