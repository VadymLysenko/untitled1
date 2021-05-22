package day_14_multi_branch_if_statements;

public class IfwithoutElse {
    public static void main(String[] args) {
        int year = 2020; // if false will print only last one
        if(year == 2020) {


            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask and keep distance");
        }
        System.out.println("Keep coding java");
        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pannsylvania ave");
            System.out.println("Welcome to " + country);
        }
    }

}
