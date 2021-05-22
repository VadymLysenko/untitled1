package day_08_castingScanner;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        //System.out.println("Please enter your name");
    plus();
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you");
        int age = input.nextInt();

        System.out.println(age + " ... That's quite old!");
    }

    public static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");

        int num1 = scan.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scan.nextInt();
        System.out.println("result: ");
        int result = scan.nextInt();
    }


}
