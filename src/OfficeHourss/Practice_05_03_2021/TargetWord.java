package OfficeHourss.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "c++", "python", "java"));
        String targetWord = "java";

        int count = 0;

        for(String word : words){
            if(word.equals(targetWord)){
                count++;
            }

        }
        System.out.println(words);
        System.out.println(targetWord + " was found " + count);



    }
}
