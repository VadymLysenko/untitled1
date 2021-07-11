package day_100_practice_my_own;

public class Practice {

    public static void main(String[] args) {
        System.out.println(reverse("Apple"));
    }
    public static String reverse(String str) {
        String word = "";
        for (int i = str.length()-1; i >= 0; i--) {
            word += str.charAt(i);
        }
        return word;
    }

}
