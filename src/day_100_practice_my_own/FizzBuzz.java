package day_100_practice_my_own;

public class FizzBuzz {
    public static void main(String[] args) {
        int num =12;
        if(num%15==0) {
            System.out.println("FizzBuzz");
        } else if(num%3==0) {
            System.out.println("Fizz");
        } else if(num%5==0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
