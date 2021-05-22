package day_26_loops;

public class MultiplicationWithNumber {
    public static void main(String[] args) {
        int number = 10;
        /**
         * if number less then 1 or more the 10
         * print "ERROR: invalid input"
         * exit main method: return;
         */
        if(number < 1 || number >10){
            System.out.println("ERROR: invalid input");
            return;
        }

        for(int i = 1; i <= 10; i++){
            int total = number * 1;
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
