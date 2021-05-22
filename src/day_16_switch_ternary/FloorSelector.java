package day_16_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {

        int floorNum = 2;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2){
            System.out.println("Floor 2 selected. Companies: Cyberteck, NASA, Intelsat");
        }else if (floorNum == 3){
            System.out.println("Floor 3 selected. Companies: Lyft, Bofa, Stake house");
        }else{
            System.out.println("Invalid floor");
        }
        System.out.println("========SWITCH STATEMENT VERSION=========");

        floorNum = 4;
        switch(floorNum){
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cyberteck, NASA, Intelsat");
            break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, Bofa, Stake house");
            break;
            default:
                System.out.println("Invalid floor");
            break;

        }

    }
}
