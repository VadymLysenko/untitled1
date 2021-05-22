package day_36_methods_with_return;

import java.sql.SQLOutput;

public class CreditScore {

    public static void main(String[] args) {
        checkEligeble(750);
        checkEligeble(400);
        checkEligeble(815);
        System.out.println(getCreditScore());
        System.out.println("Credit Score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);

    }
    public static void checkEligeble(int creditScore){
        if (creditScore > 700){
        System.out.println("eligeble");
    }else{
        System.out.println("not eligeble");
    }
}

public static int getCreditScore(){
        return 800;

}



}