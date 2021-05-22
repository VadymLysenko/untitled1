package day_19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("i"));

        System.out.println(word.startsWith("j"));

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if(name.endsWith("a")){
            System.out.println("Maybe, it is a female name");

        }

        String firstName = "Mrs. Vadym";
        if(firstName.startsWith("Mr.")){
            System.out.println("Man: " + firstName);
        }else if(firstName.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if(firstName.startsWith("Mrs.")){
            System.out.println("Married woman");
        }else if(firstName.startsWith("Ms.")){
            System.out.println("Single woman");
        }else if(firstName.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("Normal name");
        }
        String urlName = "https: // www.stackoverflow.com";
        if(urlName.endsWith(".ua")){
            System.out.println("Commercial web");
        }else if(urlName.endsWith(".ua")){
            System.out.println("Ukrainian web");
        }else if(urlName.endsWith(".gov")){
            System.out.println("Government web");
        }else if(urlName.endsWith(".edu")){
            System.out.println("Educational web");
        }else if(urlName.endsWith(".org")){
            System.out.println("Organization web");
        }else{
            System.out.println("Wrong ");
        }








        }
    }

