package day_09_scanner_practice;
import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old areyou?");
        int age = scan.nextInt();
        System.out.println(age + " - that's great age!");

    }

}
