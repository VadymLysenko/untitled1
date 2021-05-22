package day_32_array_split;

import com.sun.deploy.panel.ITreeNode;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        System.out.println("------- FIND INDEX OF 'GLOVES' in items array --------" );
        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("Gloves")){
                System.out.println("index of Gloves = " + i);
                break;
            }
        }
        System.out.println("----- Set boolean to true if iPad is found ------");
        boolean iPadExits = false;

        for(String item : items){
            if(item.equalsIgnoreCase("iPad")){
                iPadExits = true;
                break;
            }
        }
        System.out.println("iPadExits " + iPadExits);
        if(iPadExits){
            System.out.println("We bought the iPad");
        }else{
            System.out.println("We forgot the iPad");
        }
        System.out.println("Print a report for each shopping item");
        for(int i = 0;i< items.length;i++){
            System.out.println(items[i]+ " - $"+prices[i]+" - #"+itemIDs[i]);


        }
        System.out.println("===== Look for Jacket =====");
        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i]+ " - $"+prices[i]+" - #"+itemIDs[i]);
                break;
            }
        }
        System.out.println("===== Look for Airpods =====");
        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("Airpods")){
                System.out.println(items[i]+ "- $"+prices[i]+" - #"+ itemIDs[i]);
                break;
            }
        }
    }


    }

