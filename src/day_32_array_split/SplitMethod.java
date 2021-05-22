package day_32_array_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java,python,selenium,html";
        String[] wordsArray= words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " +wordsArray.length);

        for(String each : wordsArray){
            System.out.println(each);
        }

        String sentence = "we are coding java arrays";
        String[] arSentence = sentence.split(" ");
        System.out.println("first word = " + arSentence[0]);
        System.out.println(sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = " + arSentence.length);
        for(String each : arSentence){
            System.out.println(each);
        }


        //String cats = "bengal cat tabby";

    }
}
