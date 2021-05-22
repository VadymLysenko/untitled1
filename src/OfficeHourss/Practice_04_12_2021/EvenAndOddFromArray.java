package OfficeHourss.Practice_04_12_2021;

import java.util.*;

public class EvenAndOddFromArray {

    public static void main(String[] args) {

       // int [] nums = {4,1,3,12,5};

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you have");
        int [] nums = new int [input.nextInt()];

        for(int i = 0; i < nums.length; i++){
            System.out.println("Enter number " + (i+1));
            nums [i] = input.nextInt();
        }


        int even = 0;
        int odd = 0;

        for(int eachNum : nums){
            if(eachNum % 2 ==0){
             even++;
            }else{
                odd++;
            }
        }
        int [] evenNumbers = new int[even];
        int [] oddNumbers = new int[odd];

        for(int i = 0, e = 0, o =0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNumbers[e++] = nums[i];

            } else {
                oddNumbers[o++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(evenNumbers));
        System.out.println(Arrays.toString(oddNumbers));


        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);


    }
}
