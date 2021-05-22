package day_44_custom_classes;

public class App {

  String name ; // null by default
  double version; // 0.0 by default
  //Open method is using name and version variables
  public void open(){
    System.out.println("opening " + name + " app version " + version);
  }
}
