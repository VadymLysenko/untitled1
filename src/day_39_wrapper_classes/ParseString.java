package day_39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");
        }
        String sentence = "I worte 857 lines of code";
        String [] arr = sentence.split(" ");
        int linesOfCode = Integer.parseInt(arr[2]);
        System.out.println("lines of code " + linesOfCode);
    }
}
