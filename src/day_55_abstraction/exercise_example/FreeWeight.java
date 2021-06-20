package day_55_abstraction.exercise_example;

public class FreeWeight extends Lifting{
    @Override
    public void perform() {
        System.out.println("Performing Free Weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells ");
    }
}
