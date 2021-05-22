package day_15_logicalLops_switch_ternary;

import java.net.CookieStore;
import java.util.Scanner;
public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Chicago";
        double Salary = 120000;
        boolean isRemote = true;
        boolean hasBenefits = true;
        if(location.equals("Chicago") && Salary >= 120000 && isRemote && hasBenefits){
            System.out.println("Sure, i will accept this offer");
        }else{
            System.out.println("Let's consider another offer or negotiate");
        }
     Scanner scan = new Scanner(System.in);

        boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
        String sport = "";

        if(isTall){

            if(isFast){
                sport = "basketball";
            }else if(isFlexible){
                sport = "gymnastics";

            }else{
                if(isFast){
                    sport = "soccer";
                }else{
                    sport = "tennis";
                }
            }
            System.out.println(sport);
        }

       }
        }




