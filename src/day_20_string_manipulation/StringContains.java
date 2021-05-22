package day_20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));     // true
        System.out.println(company.contains("ital"));  // true
        System.out.println(company.contains("l o"));   // true
        System.out.println(company.contains(" "));
        System.out.println(company.contains("j"));
        System.out.println(company.contains("Cap"));

        //if company contains space, print "company name with multiple words"
        // else "single word company name"
        if(company.contains(" ")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("single word company name");
            String etsyTitle = "Wooden spoon | Etsy";
            // check if " | " is in etsyTitle
            if(etsyTitle.contains(" | ")){
                System.out.println("Title pissed");
            }else{
                System.out.println("Fail title is name ");

            }


        }
        String firstName = "Vadim";
        System.out.println(firstName.contains("a"));
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("a or i is present");
        }else{
            System.out.println("not a or i is present");
        }
        String email = "vadymlysenko@myemail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("valid email");
        }else{
            System.out.println("invalid email");
        }
        if(email.toLowerCase().contains("d")){
            System.out.println("d is present");
        }else{
            System.out.println("d is not present");
        }





    }
}
