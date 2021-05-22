package day_09_scanner_practice;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" FahrenheitValue to Celcium converter");
        System.out.println("Enter temparature:");
        //double FahrenheitValue = 50;
        double FahrenheitValue = input.nextDouble();
        double CelciumValue = (FahrenheitValue -32) * 5 / 9;
        System.out.println(FahrenheitValue + " F is in C: " + CelciumValue);
    }

}
