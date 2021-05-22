package day_38_methods;

import static day_38_methods.StringUtils.*;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(""));
        System.out.println(isNullOrEmpty(" "));
        String word = null;
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be null or empty");
        }

        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        System.out.println(StringUtils.isPalindrome("civic"));
        System.out.println(StringUtils.isPalindrome("kayak"));
        System.out.println(isPalindrome("cybertek"));


        String word1 = "sunday";
        System.out.println(reverse("java"));
        System.out.println(StringUtils.reverse(word1));

    }
   public static boolean isNullOrEmpty(String str) {
       return (str == null || str.isEmpty());


   }
   public static boolean isPalindrome(String str){
        boolean isPalindrome = true;
        str = str.toLowerCase();
        for(int i = 0; i< str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalindrome = false;

            }
        }
        return isPalindrome;
   }
   public static String reverse (String str){
        String strReverse = "";
        for(int i = str.length()-1;i>=0;i--){
            strReverse += str.charAt(i);
        }
        return strReverse;
   }

}
