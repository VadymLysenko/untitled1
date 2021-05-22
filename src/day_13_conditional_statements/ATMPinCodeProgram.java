package day_13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ****");
        int secretPincode = 1234;
        int inputPincode = 1234;

        if (secretPincode > inputPincode){
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        } else {
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("Please try again!");
        }
        System.out.println("Thank you for using TD bank ATM!");
    }
}
