package day_16_switchStatement;

public class Switch_Practice {
    public static void main(String[] args) {
        int restourantRating = 3;
        switch(restourantRating){
            case 1:
                System.out.println("This restoruant is not my favorite");
                break;
            case 2:
                System.out.println("This restaurant is good");
                break;
            case 3:
                System.out.println("This restaurant is fantastic");
                break;
            default:
                System.out.println("I've never dined at this restaurant");
                break;
        }
        int num = 1;
        switch(num){
            case 1:
                System.out.println("One");
        }
    }
}
