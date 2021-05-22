package day_32_array_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String word = "java is fun";
        String[] reverseSentence = word.split(" ");
        for(int i = reverseSentence.length-1; i >= 0; i--){

            System.out.print(reverseSentence[i]+" ");
        }

    }
    }

