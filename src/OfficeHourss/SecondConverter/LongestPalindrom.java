package OfficeHourss.SecondConverter;

public class LongestPalindrom {
    public static void main(String[] args) {
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String  longestPlidrome = "";
        for(String word : words){

            boolean isPalindrome = true;

            // Q: What if your String has a million characters

            for(int i=0; i < word.length()/2; i++) {

                if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome && word.length() > longestPlidrome.length()){
                longestPlidrome = word;
            }
        }
        System.out.println(longestPlidrome);
    }
}
