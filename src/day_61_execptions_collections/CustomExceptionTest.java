package day_61_execptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 50;
        if(minutes > 50) {
            System.out.println("Class is going on for "
                    + minutes + " minutes");
            throw new BreakTimeException("It is break time");
        }
        System.out.println("Let's continue the class");

        double balance =600;
        double itemPrice=500;
        System.out.println("i have $" + balance + "and purchasing item for$" + itemPrice);
        if(itemPrice>balance){
            throw new InsufficientBalanceException("Transaction declined");
        }else{
            System.out.println("Item purchases");
        }
        System.out.println("Transaction ended");
    }
}
