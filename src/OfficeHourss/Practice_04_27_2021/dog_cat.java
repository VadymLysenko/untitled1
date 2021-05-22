package OfficeHourss.Practice_04_27_2021;
import java.util.*;
public class dog_cat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        System.out.println(countOfCats);
        System.out.println(countOfDogs);
    }

        public boolean catDog (String str){
            int catAnswer = 0;
            int dogAnswer = 0;
            int cat_Count = 0;
            int dog_Count = 0;



            for (int i = 0; i < str.length() - 1; i++) {
                String sub = str.substring(i, i + 2);


                if ((sub.equals("cat"))) cat_Count++;
                if ((sub.equals("dog"))) dog_Count++;
                catAnswer = cat_Count;
                dogAnswer = dog_Count;

            }
            if (dogAnswer == catAnswer) {
                {
                    return true;

                }

            }

            return false;
        }

    }
