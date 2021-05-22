package OfficeHourss.Practice_04_12_2021;

public class minAndMaxFromArray {

    public static void main(String[] args) {

        int [] arr = {3,1,5,-3,10,4,3};
        int min = arr[0];
        int max = arr[0];

        for(int each : arr){

            if(each < min){
                min = each;
            }
            if(each > max){
                max = each;
            }
            System.out.println(each);

        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
