package day_32_array_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
       int index = 0;
       double max = prices[0];
       for(int i = 0; i < prices.length; i++){
           if(prices[i]>max){
               max=prices[i];
               index = i;

           }
       }
        System.out.println("The max price item is: "+ items[index] + " and price is: " + prices[index] + "$");
        System.out.println("indexOfMaxPrice = " + index);
        System.out.println(prices[index] + " - $" + prices[index] + " - #" + itemIDs[index]);

       double min = prices[0];
       for(int i = 0; i < prices.length; i++){
           if(prices[i]<min){
               min=prices[i];
               index = i;

           }
       }
        System.out.println("The min price item is: "+ items[index] + " and price is: " + prices[index] + "$");
        System.out.println("indeOfMinPrice = " + index);

    }
}
