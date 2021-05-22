package day_26_loops;

import java.util.Scanner;

public class CountMatches {
    public static void main(String[] args) {
//        String word = "java";
//        char letter = 'a';
//        int count = 0;
//        for(int i = 0; i < word.length();i++){
//            if(word.charAt(i)==letter){
//                count++;
//            }
//        }
//        System.out.println(count);


        Scanner scan = new Scanner(System.in);
        String answer = "";
        String item = "";
        double price = 0;

        String result = "";
        double total = 0;
        int counter = 1;
        //YOUR CODE HERE


        do {
            System.out.println("Enter Item" + counter + " and its price:");
            item = scan.next();
            price = scan.nextDouble();

            System.out.println("Add one more item?");
            answer = scan.next();

            result += "Item" + counter + ": " + item + " Price: " + price + ", ";
            total += price;

            if (answer.equals("no")) {
                break;
            }else {
                while (!answer.equalsIgnoreCase("yes")){
                    System.out.println("Please enter yes or no");
                    answer = scan.next();
                }
            }

            counter++;
        } while (true);

        System.out.println(result.substring(0, result.length()-2));
        System.out.println("Total price " + total);
    }


}
//output: Enter Item1 and its price:
//        input: Lemons
//        input: 2.3
//        output: Add one more item?
//        input: yes
//        output: Enter Item2 and its price:
//        input: Oranges
//        input: 6
//        output: Add one more item?
//        input: no
//        output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0
//        output: Total price: 8.3
