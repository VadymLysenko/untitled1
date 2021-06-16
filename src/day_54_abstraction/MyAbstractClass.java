package day_54_abstraction;

public abstract class MyAbstractClass {
    public void learn() {
        int num = 32;
        System.out.println("Learning...");
    }
    public abstract void close();
}

class Sub extends MyAbstractClass {
    public void close() {
        System.out.println("Close - abstract method implementation ");
    }
}
class MyObjects {
    public static void main(String[] args) {
    //MyAbstractClass mac = new MyAbstractClass();
        Sub sub = new Sub();
        sub.learn();
        sub.close();

    }
}
