package day_13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 1000;
        double salesAmount = 5000.0;

        if (salesAmount <= 2000) {
            System.out.println("Good job you qualified for full bonus!");
            System.out.println("Assigning 50$ to bonus ");
        } else {
            System.out.println("Great job you are qualified for full bonus");
            System.out.println("Assign 100$ to bonus");

        }
        System.out.println("salesAmount = " + bonus);
    }
}
