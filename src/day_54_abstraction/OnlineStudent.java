package day_54_abstraction;

public class OnlineStudent extends Student {
    @Override
    public void attendClass()  {
        System.out.println("Online student is attending class on zoom");
    }

}
