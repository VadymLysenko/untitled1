package day_17_ternary_nasted_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "Drink";
        String drinkItem = "Coke";
        String snackItem = "Chips";
        if(selection.equals("Drink")){
            System.out.println("Drink option selected");
        }if (drinkItem.equals("Tea")){
            System.out.println("Tea option selected");
        }else{
            System.out.println("coke item is selected");
            if(snackItem.equals("Chips")){
                System.out.println("Snack option selected");
            }else if(selection.equals("snack")){
                System.out.println("snack option is selected");
                if(snackItem.equals("chips")){
                    System.out.println("chips option is selected");
                }else{
                    System.out.println("candy option is selected");
                }
            }
        }
     }
}
