package day_44_custom_classes;

public class Animal {

    String type = "monkey";

     public void eat() {
         System.out.println("eating");
     }

     public void eat(String food) {
         System.out.println("eating " + food);
     }

     public void speak(String language) {
         System.out.println(type + " speaking " + language);
     }
}
