package day_41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23,1,34,54,654);
        System.out.println("nums = " + nums);
        //nums.add(100); unsupported operation
        //nums.remove(); unsupported operation
        //nums.clear():  unsupported operation
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4,2,23,5344,100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsLists = " + numsList);
        numsList.remove(0);
        System.out.println(numsList);
        numsList.remove(new Integer(23));
        System.out.println(numsList);


        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffe","tea","celsius","monster","red bull",
                "coke","pepsi","kambucha","mdew"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for(String drink : drinksWithCaffeine){
            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")){
                caffeineAmount=150;
                System.out.println(drink+" --> " + caffeineAmount);
            }else if(drink.equals("coffe") || drink.equals("kambucha")){
                caffeineAmount=112;
                System.out.println(drink +" --> " + caffeineAmount);
            }else if(drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")){
                caffeineAmount=35;
                System.out.println(drink+" --> " + caffeineAmount);
            }
            System.out.println("---------------------------------------");
        }

        for(String drink : drinksWithCaffeine){
            switch (drink){
                case "monster": case"red bull": case"celsius":
                    caffeineAmount=150;
                    System.out.println(drink + " - " + caffeineAmount);
                    break;
                case "coffe": case "kambucha":
                    caffeineAmount=112;
                    System.out.println(drink + " - " + caffeineAmount);
                    break;
                case "tea": case"coke": case"pepsi": case"mdew":
                    caffeineAmount=35;
                    System.out.println(drink + " - " + caffeineAmount);
                default:

            }
        }
        System.out.println("-------------------------------------------");
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase(Locale.ROOT)));
        drinksWithCaffeine.forEach(drink -> {


        });
        drinksWithCaffeine.forEach(each -> {


            System.out.println("-------");
            System.out.println("each = " + each);
            System.out.println("-------");
        });
    }
}
