package day_10_shorthand_operatprs;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How the weather today?");
        //String weather = "sunny ";
        String weather = scan.next();
        //String weather = scan.nextLine();
        System.out.println(weather + " - is a nice day today!");

    }

}
