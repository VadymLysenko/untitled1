package day_22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13));
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));
        // now we can combine them into 1 statement
        System.out.println(result.substring(result.indexOf(":") +1));
        String today = "i learned [java] today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]") ));

    }
}
