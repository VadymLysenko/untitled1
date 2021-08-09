package day_100_practice_my_own;

public class Array_FinMinNum {
    public static void main(String[] args) {
        System.out.println(Integer.min(3,5));
    }
    public int MaxValue(int[] n) {
        int min = Integer.MAX_VALUE;

        for(int each : n) {
            if(each < min) {
                min = each;
            }
        }
        return min;
    }
}
