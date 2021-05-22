package day_46_encapsulation;

public class Chase {

    public static void main(String[] args) {

        CheckingAccount acc1 = new CheckingAccount();
        acc1.setAccountNumber(123456789);
        acc1.setBalance(100000.99);
        acc1.setAccountHolder("Vadym Lysenko");
        acc1.setType("24/7 checking");

        System.out.println("acc = " + acc1);

    }
}
