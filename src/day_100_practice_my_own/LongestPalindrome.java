package day_100_practice_my_own;

public class LongestPalindrome {
    public static void main(String[] args) {
        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String  longestPalindrome = "";
        for(String word : words){

            boolean isPalindrome = true;

            // Q: What if your String has a million characters

            for(int i=0; i < word.length()/2; i++) {

                if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome && word.length() > longestPalindrome.length()){
                longestPalindrome = word;
            }
        }
        System.out.println(longestPalindrome);
    }
    }

