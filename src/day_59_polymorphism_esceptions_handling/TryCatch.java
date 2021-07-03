package day_59_polymorphism_esceptions_handling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        } catch (Exception e) {
            System.out.println("RuntimeException happened and handled");
        }
        System.out.println("After first catch");

        try {
            int[] nums = {11, 33, 44};
            System.out.println(nums[0]);
            System.out.println(nums[3]);
            System.out.println(nums[1]);
        }catch(Exception e) {
            System.out.println("ArrayIndexOutOfBoundException is caught and handled");
        }
        System.out.println("After first catch");
    }
    }

