package day_16_switchStatement;

public class TernaryInfo {
    public static void main(String[] args) {
        int score = 90;
        if (score > 60) {
            String result = score >= 60 ? "pass" : "fail";
            System.out.println("result = " + result);
        }
    }
}
