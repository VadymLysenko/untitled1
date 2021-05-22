package day_25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
        while(isHungry){
            bananas++;
            System.out.println("Eating a banana: \uD83C\uDF4C " + bananas);
            if(bananas == countToFull){
                isHungry = false;
            }else if(bananas != countToFull){

            }
        }
        System.out.println("Had enough bananas \uD83C\uDF4C , let's get back to studying");

        }
    }
