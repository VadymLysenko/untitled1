package day_25_loops;

public class PrintStarts {
    public static void main(String[] args) {
        for(int star = 0; star < 15; star++){
            System.out.print("Cybertek \u2B50\uFE0F " + "* ");
        }
        String myStars = "";
        for(int i = 1; i <= 5; i++ ){
            myStars +="\u2B50\uFE0F";
        }

        System.out.println("\n myStars = " + myStars.trim());
    }
}
