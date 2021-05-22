package day_15_logicalLops_switch_ternary;

public class NotLogicalOperators {
    public static void main(String[] args) {
        int apples =5;
        System.out.println(!(apples<2));
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        // check if age is NOT more then 7. print "Need to sit in child car seat.
        System.out.println(!(age > 7));
        if(!(age > 7)){
            System.out.println("Need to sit in child car seat. age = " + age);
        }else{
            System.out.println("Can sit in passanger seat. age " + age);
        }

        boolean isSmokingAllowed = true;

        // if smoking is not allowed: print "Smoking is now allowed here. Exit
        if (!isSmokingAllowed){
            System.out.println("Smoking is now allowed here. Exit");
        }else{
            System.out.println("Smoking area");
        }
        boolean isAffordable = true;
        // if NOT Affordable then print "Item Not Affordable"
        if (!isAffordable){
            System.out.println("Item Not Affordable");
        }else{
            System.out.println("Yes you can buy it");
        }
        String env = "qa";
        if(env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }
        String carModel = "Tesla";
        if (!carModel.equals("Tesla") ){
            System.out.println("Not interested");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }
        if(inputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }
    }
}
