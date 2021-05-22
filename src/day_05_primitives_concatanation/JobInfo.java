package day_05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "Experience in Java, Selenium, Cucumber, Tomato, JUnit";
        double salary = 123000;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;

        System.out.println("Title: " + title );
        System.out.println("Company:" + company);
        System.out.println("job description: " + jobDescription);
        System.out.println("salary: $"+ salary);
        System.out.println("Years of Experiance: " + yearsOfExp);
        System.out.println("Has benefits? " + hasBenefits);

    }
}
