package day_17_ternary_nasted_conditions;

public class MoreTernary {
    public static void main(String[] args) {
       int houtlyRate = 50;

       String reply = houtlyRate > 45 ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todayClass = "java";
        String teacher = todayClass.equals ("java") ? "Saim|Murodil" : "Nadir";
        System.out.println("Today teacher = " + teacher);

        boolean isEligibleToDrive = true;
        //String driving; // "have Dl and can drive" : "No Dl cannot drive"
        String driving = isEligibleToDrive ? " Happy driver Have DL can drive" : "Not happy driver No DL cannot drive";
        System.out.println("driving = " + driving);
    }
}
