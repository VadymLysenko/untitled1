package day_100_practice_my_own;

public class ReverseString1 {
    public static void main(String[] args) {
        String input1 = "FolksIsFolks";
        char[] try1 = input1.toCharArray();

        for(int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}
