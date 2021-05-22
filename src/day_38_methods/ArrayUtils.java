package day_38_methods;
import static day_38_methods.ArrayUtils.*;
public class ArrayUtils {


    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }
    public static boolean contains(int [] nums, int num){
        for(int number : nums){
            if (number == num){
                return true;
            }
        }
        return false;
    }
}