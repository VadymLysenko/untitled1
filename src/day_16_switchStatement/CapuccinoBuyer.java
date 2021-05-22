package day_16_switchStatement;

public class CapuccinoBuyer {
    public static void main(String[] args) {
        String size = "Grande";
        double price = 0.0;
        int calories = 0;

        switch(size){
            case "Tall":
                System.out.println("Tall Capuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "Grande":
                System.out.println("Grande Capuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "Venti":
                System.out.println("Venti Capuccino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't serve that"+size+" size of Capuccino");
         }
        System.out.println("Total price: $" + price);
        System.out.println("Total calories: " + calories);
        }
    }

