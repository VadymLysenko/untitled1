package day_18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Audi";
        String model = "A3";
        double leasePrice = 0.0;

          if(make.equals("Mercedes") && model.equals("E")){
        leasePrice = 500.0;
        }else if(make.equals("Mercedes") && model.equals("A")) {
              leasePrice = 400.0;
          }
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {

            } else if (model.equals("A")) {
                leasePrice = 400;
            }
            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("leasePrice = " + leasePrice);
        }
        if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePrice = 552;

            } else if (model.equals("A3")) {
                leasePrice = 412;
            }
            System.out.println("make = " + make);
            System.out.println("model = " + model);
            System.out.println("leasePrice = " + leasePrice);
        }else{
            System.out.println("Invalid make");
        }

    }
    }

