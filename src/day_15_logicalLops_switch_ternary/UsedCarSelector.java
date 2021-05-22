package day_15_logicalLops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
       double budget = 5_000;
       String model = "Honda";
       double carPrice = 8999_0;
       if (carPrice <= budget && model.equals("Toyota") || model.equals("Honda")) {
           System.out.println("You can buy " + model + " within your budget " + budget );
       }else{
           System.out.println("No model model in this price");
       }
    }
}
