package day_58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        Worker wr1 = new SuperMan();
        wr1.work("QA Manager");
        wr1.getPaid();

        ((Father)wr1).raiseKid();
        ((Father) wr1).feedKid();
        ((SuperMan)wr1).playWithKid();

        //this is downCasting from worker to SuperMan
        SuperMan superMan = (SuperMan) wr1;
    }
}
