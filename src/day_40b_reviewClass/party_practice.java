package day_40b_reviewClass;
import java.util.*;
public class party_practice {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String sentence = scan.nextLine();

            int charCount = sentence.length();
            int tCharCount = 4;
            int javaCNT = 0, pythonCNT = 0, javascriptCNT = 0;

            for(int i = 0; i<=charCount-tCharCount; i++){

                if(sentence.substring(i,i+tCharCount).equals("java")){
                    javaCNT++;
                }

            }
            tCharCount = 6;
            for(int i = 0; i<=charCount-tCharCount; i++){

                if(sentence.substring(i,i+tCharCount).equals("phyton")){
                    pythonCNT++;
                }


            }
            tCharCount = 10;
            for(int i = 0; i<=charCount-tCharCount; i++) {

                if (sentence.substring(i, i + tCharCount).equals("javascript")) {
                    javascriptCNT++;
                }
            }
            System.out.println(javaCNT==pythonCNT);
        }
    }





