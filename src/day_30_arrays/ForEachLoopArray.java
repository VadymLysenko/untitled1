package day_30_arrays;

import java.util.Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] data = {1, 23, 345, 6789, 45678, 123456, 1234567, 99900001, 123456789, 1234567890};
        for(int eachNum : data){
            System.out.println(eachNum);
        }
        for(int n : data){
            System.out.print(n + " ");
        }

        for(int i = 0;i<data.length;i++){
            System.out.println(data[i]);
        }

        System.out.println("last value: "+ data[data.length-1]);


        for(int j = data.length-1;j>=0;j--){
            System.out.println(data[j]);
        }
        char [] array = {'D', 'C', 'B', 'A'};
        Arrays.sort(array);

        for(char each : array){
            System.out.println(each + " ");
            if (each == 'D'){
                continue;
            }
        }





    }
}
