package day_21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));


        String company = "Cybertek";
        System.out.println("First letter: " + company.charAt(0));
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eights = company.charAt(7);
        //System.out.println(first +" "+second+
                //" "+third+" "+fourth+" "+fifth+
                //" "+sixth+" "+seventh+" "+eights);

        String withSpaces = first +" "+second+
                " "+third+" "+fourth+" "+fifth+
                " "+sixth+" "+seventh+" "+eights;
        System.out.println("withSpaces = " + withSpaces);


    }
}
