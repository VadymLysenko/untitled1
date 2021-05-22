package day_26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "Java";
        for(int i = 0; i < word.length(); i++){
            System.out.println(i + "-" +word.charAt(i));
        }
        word = "automation";
        for (int i = word.length()-1; i >=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
