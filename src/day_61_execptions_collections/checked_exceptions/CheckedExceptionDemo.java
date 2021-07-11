package day_61_execptions_collections.checked_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("About to sleep for 5 seconds");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Woke up after 5 seconds");
    }
}
