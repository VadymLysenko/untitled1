package day_35_methods_with_param;

import java.util.Scanner;

public class jjj {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        int wordcharCount = word.length();
        int tCharCount = 3;

        for(int x = 0;x <= wordcharCount - tCharCount;x++){
            //System.out.println(word.substring(x,x + tCharCount ));
            String currentWord = word.substring(x, x + tCharCount);
            System.out.println(currentWord);

            if(currentWord.equals("cat")){
                countOfCats++;
                System.out.println("CAT FOUND");
            }else if(currentWord.equals("dog")){
                countOfDogs++;
                System.out.println("dog FOUND");
            }
        }
        System.out.println(countOfDogs);
        System.out.println(countOfCats);

        System.out.println(countOfDogs==countOfCats);


    }
}

