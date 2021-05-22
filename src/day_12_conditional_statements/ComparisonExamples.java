package day_12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 4_5;
        int speedLimit = 5_5;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");
        // 45 + 20  -> 65
        currentSpeed += 20; //65mph
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");

        double accountBalance = 250.25;
        double itemPrice = 300.99;
        System.out.println(accountBalance >= itemPrice); // true
        System.out.println(itemPrice >= accountBalance);
        System.out.println("can i afford? - " + (accountBalance >= itemPrice));
        System.out.println(accountBalance - itemPrice + " TotalPrice");

        boolean canIAfford = accountBalance >= itemPrice;
        System.out.println("can  afford = " + canIAfford);

        // decrease balance by item price. using shorthand operator

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am i broke - " + isBroke);









    }
}
