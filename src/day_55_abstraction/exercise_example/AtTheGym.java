package day_55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise  = new Running();// this is polymorphism another benefit of abstraction
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 minutes - calories = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 minutes - calories = " + running.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("FrreWeight 30 mins - calories  = " + freeWeight.getCaloriesCount(30));
    }
}
