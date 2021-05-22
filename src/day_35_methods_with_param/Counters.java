package day_35_methods_with_param;



public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        count(2);
        int num = 999;
        count(num);
        String word = "wooden spoon";
        count(word.length());
        printAge(1988);
        int birthYear = 2001;
        printAge(birthYear);


    }

    public static void count(int num){
        for(int i = 0; i <= num; i++){
            System.out.print(i+" ");
        }
        System.out.println();


    }
    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth age: " + year + ". Age " + age);
    }



}
