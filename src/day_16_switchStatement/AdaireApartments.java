package day_16_switchStatement;

public class AdaireApartments {
    public static void main(String[] args) {
      int numberOfBedrooms = 3;
      double startingPrice = 0;
        System.out.println("Welcome to ADAIRE Apartments");

      switch(numberOfBedrooms){
          case 1:
              System.out.println("Studio apartment selected");
              startingPrice = 1500.0;
              break;
          case 2:
              System.out.println("Two bedroom apartment selected");
              startingPrice = 1750.00;
              break;
          case 3:
              System.out.println("Three bedroom apartment selected");
              startingPrice = 2950.00;
              break;
          default:
              System.out.println("bedrooms currently not available");
              //return;
      }
        System.out.println("Starting price: $" + startingPrice);


      }

    }

