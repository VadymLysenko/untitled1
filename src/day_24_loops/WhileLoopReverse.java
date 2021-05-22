package day_24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;

        while (count >= 0){
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("Finished the count");

        int unreadSMS = 10;

        while (unreadSMS > 0){
            System.out.println("unreadSMS \uD83D\uDCE9 = " + unreadSMS);
            unreadSMS--;

        }
        System.out.println("No more messages \uD83D\uDCE9");
    }
}
