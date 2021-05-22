package day_30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "1234";
        student1[1] = "Vadym";
        student1[2] = "Lysenko";
        student1[3] = "B22";
        student1[4] = "123-456-7890";

        String[] student2 = {"5678","George", "Varvick", "B22", "987-654-4321"};
        System.out.println("sudent1 id = "+ student1[0]);
        System.out.println("student firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batch number = " + student1[3]);
        System.out.println("student1 phone number = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if(student1.length == 5){
            System.out.println("Student 1 data array has correct length");

        }else{
            System.out.println("Student a data array has incorrect length");

            }
        if(student1.length== student2.length){
            System.out.println("Pass: data arrays length match");
        }else{
            System.out.println("Fail: data arrays length mismatch");
        }
        System.out.println((student1[1] + " " + student1[2]).toUpperCase());

        String mobilNum = student1[4];

    }
}
