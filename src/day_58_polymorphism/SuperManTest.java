package day_58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.feedKid();
        spMan1.playWithKid();
        spMan1.raiseKid();
        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");
        System.out.println("got paid 130000$ + benefits + paid vocations " + spMan2.getPaid());

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("Developer");
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();
        System.out.println("Developer got paid 150000$ + more work + free vocation " + spMan3.getPaid());

    }
}
