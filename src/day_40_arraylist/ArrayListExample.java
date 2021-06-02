package day_40_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public void add(int num) {
        System.out.println("adding = " + num);
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //ArrayList<String> words = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        //words.add("java");
        System.out.println("size = " + nums.size());
        //System.out.println("size = " + words.size());
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);


    }
}
