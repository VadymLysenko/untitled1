package day_15_logicalLops_switch_ternary;

public class CityCelector {
    public static void main(String[] args) {
        String city = "London";
        //String city2 = "Chicago";
        if (city.equals("London") || city.equals("Chicago")){
            System.out.println("We willing to relocate to " + city);
        }else{
            System.out.println("Not considering " + city);
        }
        String teacher = "Nadir";
        // Saim or Murodil -> it is a java class with Saim
        // otherwise -> Soft skill class with Nadir

        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is a java class with " + teacher);
        }else{
            System.out.println("Soft skills class with " + teacher);
        }
        // 1st branch - teacher Saim or Murodil -> It is a java class
        // - teacher Nadir -> soft skills with Nadir
        // any other teacher -> Some class with Gurhan/Akbar
        teacher = "Nadir";
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("java class with " + teacher);
        }else if (teacher.equals("Nadir")){
            System.out.println("Soft skills " + teacher);
        }else{
            System.out.println("Soft other class with " + teacher);
        }
        // company - "Google", salary >= 100k -> accept offer
        String company = "NadirTech";
        double salary = 105_000;
        if (company.equals("Apple") || salary >= 100_000){
            System.out.println("Accepting offer from " + company);
        }else{
            System.out.println("Rejecting offer from " + company);
        }

    }
}
