package day_55_abstraction.exercise_example;

public  class Running extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing Running exercise");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }
}
