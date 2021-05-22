package day_45_oop;

public class LightControl {

    public static void main(String[] args) {

     TrafficLight trafficLight = new TrafficLight();

     trafficLight.changeColor("red");
        //System.out.println(trafficLight.color); direct access to variable. not recommended
        trafficLight.showColor();


     TrafficLight trafficLight2 = new TrafficLight();
     trafficLight2.changeColor("blue");
     trafficLight2.showColor();

    }
}
