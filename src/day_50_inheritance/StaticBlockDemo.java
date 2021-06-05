package day_50_inheritance;

import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;
    static List<String> carModels;
    static {
        System.out.println("static initializer block");
        num = 10;
        //carModels.add("");
        //carModels.addAll(Arrays.asList(""));
    }
    public StaticBlockDemo() {

        System.out.println("Constructor method");
        num += 5;
    }
}
