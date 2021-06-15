package day_54_abstraction;

public abstract class MyAbstractClass {
    public void learn() {
        System.out.println("Learning...");
    }
}

class Sub extends MyAbstractClass {

}
class MyObjects {
    public static void main(String[] args) {
    //MyAbstractClass mac = new MyAbstractClass();
        Sub sub = new Sub();
        sub.learn();
    }
}
