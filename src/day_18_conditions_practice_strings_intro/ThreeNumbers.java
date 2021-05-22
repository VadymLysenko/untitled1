package day_18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 1000;
        int num2 = 100;
        int num3 = 1000;
        if (num1 >= num2 && num1>= num3){
            System.out.println("Largest number is " + num1);
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println("Largest number is " + num2);
        }else{
            System.out.println("Largest number is " + num3);
        }
    }
}
