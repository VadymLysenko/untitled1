package day_33_arrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {
        int[] nums = {5, 10 , 4, 100};
        int[] numsRev = new int[nums.length];

        for(int i = nums.length-1, j = 0;i >= 0; i--, j++){
            numsRev[j] = nums[i];
        }
        System.out.print(Arrays.toString(nums));
        System.out.print("\n"+Arrays.toString(numsRev));

    }
}
