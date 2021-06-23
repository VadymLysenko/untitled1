package day_56_abstraction.driveble;

import day_56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Flying people from one place to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 0.25) + " to fly " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto - pilot mode ");
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");
    }

    public void land() {
        System.out.println("Landing - buckle up");
    }
}
