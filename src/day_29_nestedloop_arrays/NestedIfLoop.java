package day_29_nestedloop_arrays;

public class NestedIfLoop {
    public static void main(String[] args) {
        String word = "java";
        for(int o = 0; o < word.length(); o++){
            for(int i = o; i>= 0; i--){
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
        for(int b = 0; b <= word.length(); b++){
            for(int c = b; c < word.length(); c++){
                System.out.print(word.charAt(c));

            }
            System.out.println();
        }
        for (int outer = 0; outer < word.length(); outer++){
            System.out.println("outer: " + word.charAt(outer));
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++ ){
                //System.out.println(word.charAt(inner));
                if(word.charAt(outer) == word.charAt(inner)){
                    count++;
                }
            }
            System.out.println(word.charAt(outer) +"="+count);

        }

    }
}
