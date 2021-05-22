package day_39_wrapper_classes;

import java.util.Locale;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(20, 45));
        System.out.println(Integer.min(5, 2));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Double.max(25.5, 34.5));
        System.out.println(Double.min(10.5, 3.3));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Double.compare(5, 3));
        System.out.println(Double.compare(5, 5));
        System.out.println(Double.compare(5, 45));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('V'));
        System.out.println(Character.isLetter('b'));
        System.out.println(Character.isLetter('9'));
        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println(Character.isUpperCase(letter));
        }
        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }

        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);


    }
}