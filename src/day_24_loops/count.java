package day_24_loops;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int count, number;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = keyboard.nextInt();

        count = 1;
        while(count <= number){
            System.out.print(count + ", ");
            count++;
        }

    }


}
