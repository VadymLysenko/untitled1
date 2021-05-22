package day_17_ternary_nasted_conditions;

public class AmazonPrimeShoppingNestedIf {
    public static void main(String[] args) {
        double Price = 195;
        boolean isPrimeMember = true;
        if(isPrimeMember){
            System.out.println("Eligible for free 2 day shipping");
        }else{
            if(Price >= 25){
                System.out.println("Eligeble for free regular shipping");
            }else{
                System.out.println("Not eligeble for free shipping. fee is 10$");
            }
        }
    }
}
