package OfficeHourss.Practice_04_13_2021;

import java.util.*;

public class MultipleWords {
    public static void main(String[] args) {

        String words = "knife,wooden spoon, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String [] arrWords = words.split(", ");
        System.out.println(Arrays.toString(arrWords));

    }
}
