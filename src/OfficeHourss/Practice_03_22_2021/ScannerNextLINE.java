package OfficeHourss.Practice_03_22_2021;

import java.util.Scanner;

public class ScannerNextLINE {
    public static void main(String[] args) {


        // next() vs nextLine()
        /*

        net() -> read a String value from the console it only reads a single word -> space separate

        nextLine read a String value from the console it will read multiple words
        -> Also accepts the enter input
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
    }

}
