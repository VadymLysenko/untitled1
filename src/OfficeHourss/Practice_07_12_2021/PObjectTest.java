package OfficeHourss.Practice_07_12_2021;

public class PObjectTest {
    public static void main(String[] args) {

        PA obj1 = new PA();
        Object obj2 = new PA();
        obj1.go();
        ((PA)obj2).go(); // we can casted and get our object from PA

        PB obj3 = new PC();
        obj3.go();
        ((PC)obj3).math();

        PB obj4 = new PB();
        obj4.go(); // now my object is PB which is on right side
        ((PA)obj4).go(); //polymorphism is basically what you have assign to it




    }
}
