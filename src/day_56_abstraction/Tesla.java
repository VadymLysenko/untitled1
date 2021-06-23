package day_56_abstraction;

public class Tesla extends Transportation implements SelfDrivable{
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 0.10) + " to drive " + mile + " miles ");
    }

    @Override
    public void autoPiloting() {
        System.out.println("driving it self, and you can take a nap");
    }
}
