package day_13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

        if(isHungry) {
            System.out.println("I'm hungry i will go get something to eat");
            System.out.println("Then code java");
        }else{
            System.out.println("I am not hungry, Lets keep coding java");
        }
        double price = 230.44;
        boolean isAffordable = price <=200.0;
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable) {
            System.out.println("I can afford it");
        }else{
            System.out.println("Too expansive, let's keep code java");
        }
        boolean isRemoteJob = false;
        //if is NOT remote job print "Sorry i'm not interested"
        // otherwise, print sure "Sure i'm interested, what the interview process?
        if (isRemoteJob == false) { //(!isRemoteJob
            System.out.println("Sorry i'm not interested");
        }else{
            System.out.println("Sure i'm interested, what is interview process");
        }
    }
}
