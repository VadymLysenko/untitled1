package day_09_scanner_practice;

public class SalaryCalculator {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate;");
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12; //weeklyPay * 4;
        double annualPay = monthlyPay * 12;
        System.out.println("weeklyPay: " + weeklyPay);
        System.out.println("monthlyPay: " + monthlyPay);
        System.out.println("annualPay: " + annualPay);
    }
}
