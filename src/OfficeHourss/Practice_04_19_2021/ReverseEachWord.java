package OfficeHourss.Practice_04_19_2021;

import day_38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("it starts snowing in Chicago"));
    }

    public static String reverseEachWord(String str){

        String reverse = "";

        for(String each : str.split(" ")){


           reverse +=  StringUtils.reverse(each) + " ";

        }
        return reverse.trim();

    }

}
