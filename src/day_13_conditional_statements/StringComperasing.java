package day_13_conditional_statements;

public class StringComperasing {
    public static void main(String[] args) {
        String city = "Plainfield";
        if (city.equals("Plainfied")) {
            System.out.println("It is Plainfield");
        }else{
            System.out.println("It is NOT Plainfield");
        }
        String weather = "sunny";
        //if (weather == "sunny")// it works but avoid using it
        if(weather.equals("sunny")) {
            System.out.println("Let's go out and code java");
        }else{
            System.out.println("Let's stay indoor");
        }
    }
}
