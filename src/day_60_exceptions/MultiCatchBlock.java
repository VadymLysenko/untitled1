package day_60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";

        try {
            //System.out.println(10/0);
            System.out.println("word = " + word);
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20));
        }catch(NullPointerException e) {
            System.out.println("NullPointerException caught and handled, please check if String have valid value");
        }catch(StringIndexOutOfBoundsException e) {
            System.out.println("index is wrong, please check if you entered a valid index");
        }catch(Throwable t) { // parent of all exceptions - parent type exception must be at end
            System.out.println("Exception is caught");
            System.out.println("Reason = " + t.getMessage());
        }
        System.out.println("something more code");
    }
}
