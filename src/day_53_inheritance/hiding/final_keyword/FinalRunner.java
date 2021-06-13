package day_53_inheritance.hiding.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; error cannot change value of final variable
        //final int SSN = 4321563456; can't assign new value

        //class Child extends TestData { error can't inherit from final class
        // }
    }
}
