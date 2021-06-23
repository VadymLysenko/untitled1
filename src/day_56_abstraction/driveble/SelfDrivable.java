package day_56_abstraction.driveble;

public interface SelfDrivable{
    void autoPiloting();

    default void selfPark() {// if we add default method we will prevent errors
        System.out.println("performing self park steps");
    }
}
