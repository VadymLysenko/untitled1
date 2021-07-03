package day_59_polymorphism_esceptions_handling;

public class SwallowingException {
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            System.out.println(5 / 0);
        }catch(Exception ignore){}
        System.out.println("How are you");
        System.out.println("We just suppressed / swallowed the Runtime exception");
        System.out.println("Error is not reported , we just ignore it");
    }
}
