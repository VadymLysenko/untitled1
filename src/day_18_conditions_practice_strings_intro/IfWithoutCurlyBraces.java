package day_18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "syntax";
        if(todayClass.equals("java"))
            System.out.println("java is fun");
        else
            System.out.println("it is not java. It is " + todayClass);

        int a = 10;
        if(a == 1)
            System.out.println("a is 1");
            System.out.println("1 is a");

    }
}
