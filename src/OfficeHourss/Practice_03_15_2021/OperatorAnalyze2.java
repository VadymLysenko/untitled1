package OfficeHourss.Practice_03_15_2021;

public class OperatorAnalyze2 {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a * a-- % 2 + a;
        //      -200 + - 200 * 200 % 2 + 199
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
