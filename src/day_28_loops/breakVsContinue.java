package day_28_loops;

public class breakVsContinue {
    public static void main(String[] args) {
        for(int n = 1; n <=5; n++){
            System.out.println(n);
            if(n == 3) {
                break;
            }
            }
        for(int i =1; i<=5; i++){
            if(i ==2 || i ==4){
                continue;
            }
            System.out.print(i);
        }

    }
}
