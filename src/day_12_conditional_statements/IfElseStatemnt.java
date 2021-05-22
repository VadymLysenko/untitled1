package day_12_conditional_statements;

public class IfElseStatemnt {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("condidtion was true");
        }else {
            System.out.println("condition is false");
        }

        int count = 14;
        // check if count more then 30 if yes print count more then 30
        //otherwise print "count is less than 30"
        if (25 > 30) {
            System.out.println("count is more than 30");
        }else{
            System.out.println("count is less than 30");
        }

        byte age = 25;
        if (age >= 18) {
            System.out.println("eligible to vote");
            System.out.println("age is greater or equal to 18");
        }else{
            System.out.println("not eligible to vote");
            System.out.println("age is number");
        }
    }
}
