package day_58_polymorphism;

public abstract class OnlineShopping implements Prime{
    public abstract void buy();
    public abstract void sell();
    public  void ship(){
        System.out.println("Shipping purchased items");
    }


}
