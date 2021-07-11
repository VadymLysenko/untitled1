package day_61_execptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 70;
        if(minutes > 50) {
            System.out.println("Class is going on for "
                    + minutes + " minutes");
            throw new BreakTimeException("It is break time");
        }
        System.out.println("Let's continue the class");
    }
}
