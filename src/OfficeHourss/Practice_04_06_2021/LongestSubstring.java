package OfficeHourss.Practice_04_06_2021;

public class LongestSubstring {
    public static void main(String[] args) {
        /*Biggest substring of matching characters
        Given a String find the biggest substring of chars that match and print it.
         Ex: aaabbbcccccddddee Output: ccccc

         */
        String str = "aabbccceeee";
        String longestSubstring = "";
        String temp = "";
        str += " ";
        for (int i = 0; i < str.length()-1; i++) {
            temp += str.charAt(i);
            if (str.charAt(i) != str.charAt(i+1)){
                if (temp.length() > longestSubstring.length()){
                    longestSubstring = temp;
                }
                temp = "";
            }
        }
        System.out.println(longestSubstring);



    }
}
