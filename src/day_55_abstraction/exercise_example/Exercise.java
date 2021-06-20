package day_55_abstraction.exercise_example;

public abstract class Exercise {
    public void start() { //non - abstract method
        System.out.println("Warming up and starting the exercise");
    }
    // abstract method - without body, just signature
    // - purpose: letting subclasses implement or override their own way
    public abstract void perform();

    //another abstract method that concrete sub classes will override/implement
    //param minutes - how long is exercise is performed
    //returns number of calories burned or used
    public abstract int getCaloriesCount(int minutes);

}
