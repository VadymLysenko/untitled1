package day_38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] nums = {5,23,1,543,90};



        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int [] {23,45,65,456,789,54,25});
        System.out.println(ArrayUtils.sum(nums));
        System.out.println(ArrayUtils.sum(new int [] {23,45,65,456,789,54,25}));
        System.out.println(ArrayUtils.contains(nums, 23));

    }

    }

