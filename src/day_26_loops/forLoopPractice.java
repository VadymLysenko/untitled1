package day_26_loops;

public class forLoopPractice {
    public static void main(String[] args) {
        for(int n = 1;n<=10;n++){
            System.out.println("*");
        }
        for(int i = 10; i>= 0; i--){
            System.out.println(i + ", ");
        }
        for(int j = 0; j < 50; j++){
            if(j % 2 != 0){
                System.out.println(j);
            }
        }
        String [] fruits = new String[3];
        fruits[0]= "apples";
        fruits[1]= "pears";
        fruits[2]= "oranges";

        for(int i = 0; i < 3; i++){
            System.out.println(fruits[i]);
        }


    }
}
