package OfficeHourss.Practice_03_24_2021;

import java.util.Locale;

public class CharIndex {
    public static void main(String[] args) {
        /*
        index

        java is
        0123456

        charAt(number) -> gives a character
        indexOf(char)  -> gives a int (index)

        */
        String s = "java";
        System.out.println(s.charAt(0) + "" + s.charAt(3));

        String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);
        System.out.println(upper);

        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('m'));

        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j') >= 0? "Contains": "Not contains");
        System.out.println(s.indexOf('g') >= 0? "Contains": "Not contains");

        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));

        System.out.println(s.toLowerCase().replace("j","e").startsWith("a"));
    }
}
