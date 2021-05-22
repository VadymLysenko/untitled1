package day_14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";

        if (weather.equals("sunny")){
            System.out.println("When sunny go to park and code java");
        } else if(weather.equals("rainy")){
            System.out.println(weather + " - stay home, drink tea, and code java");
        } else if(weather.equals("snowy")){
            System.out.println(weather + " - clean the car then build snowman, drink hot chocolate, and code java");
        } else if(weather.equals("windy")){
            System.out.println(weather + " - Get ready for power loss, fly a kite, and code java");
        }else{
            System.out.println("just keep coding java");
        }

    }
}
