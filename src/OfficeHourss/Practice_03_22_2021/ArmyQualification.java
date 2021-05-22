package OfficeHourss.Practice_03_22_2021;

public class ArmyQualification {
    public static void main(String[] args) {
        String citizenship = "USA";
        boolean resident = true;
        int age = 18;
        boolean hasDiploma = true;

        if(citizenship.equalsIgnoreCase("USA") || resident == true){
            if(age >= 18 || age <= 35){
                if(hasDiploma){
                    System.out.println("Your are qualified for the US Army");
                }else{
                    System.out.println("You must have high school diploma ");
                }

            }else{
                System.out.println("Your age must be 18 or 35");
            }
        }else{
            System.out.println("You must be U.S. citizen or a resident");
        }
    }
}
