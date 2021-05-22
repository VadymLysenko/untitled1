package day_37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
    repeatString("java", 3, '*');
        System.out.println(repeatString("hi", 3,'|'));
        System.out.println(repeatString("java", 10, '-'));
    }
    public static String repeatString(String word, int times, char delimiter) {
        String retValue = "";
        for (int i = 0; i < times; i++) {
            if(i == times){
                retValue += word;
            }
            retValue += word+delimiter;

        }
        return retValue;

    }
}
