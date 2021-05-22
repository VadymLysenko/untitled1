package day_37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {

        System.out.println(getDayName(1));
        System.out.println(getDayName(2));
        System.out.println(getDayName(7));
        System.out.println(getDayName(8));
        System.out.println(getDayName(3));



        for(int i = 0; i <=8; i++){
            System.out.println(i + " = " + getDayName(i));

            String today = getDayName(6);
            System.out.println("today = " + today);
            String someDay = getDayName(0);
            if (someDay== null){
                System.out.println("someDay is null for invalid day");
            }
        }

    }
    public static String getDayName(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("Invalid day - " + day);
                return null;


        }

    }

}
