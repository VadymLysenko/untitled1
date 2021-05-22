package OfficeHourss.Practice_03_17_2021;

public class HouseBuyer {
    public static void main(String[] args) {
        String name = "Canyon";
        double price, rating;
        boolean gated, allowPets;

        switch (name) {
            case "Hills":
                price = 89000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;
            case "Oak":
                price = 75000;
                gated = false;
                rating = 4.0;
                allowPets = true;
                break;
            case "Highland":
                price = 150000;
                gated = true;
                rating = 4.5;
                allowPets = false;
                break;
            case "Canyon":
                price = 201000;
                gated = true;
                rating = 4.8;
                allowPets = true;
                break;
            default:
                price = 0;
                rating = 0;
                gated = false;
                allowPets = false;

                System.out.println("name = " + name);
                System.out.println("rating = " + rating);
                System.out.println("price = " + price);
                System.out.println("gated = " + gated);
                System.out.println("allowPets = " + allowPets);


        }
    }
}