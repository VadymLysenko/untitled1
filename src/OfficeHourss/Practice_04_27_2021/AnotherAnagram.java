package OfficeHourss.Practice_04_27_2021;

public class AnotherAnagram {
    public static void main(String[] args) {
        System.out.println(isAnAnagram("listen","istlne"));
    }
    public static boolean isAnAnagram(String word1,String word2){
        if (word1 == null || word2 == null)
            return false;
        if (word1.length() == word2.length() && word2.compareTo(word1) >= 0)
        {

            return true;
        }
        else {
            return false; }
    }


}


