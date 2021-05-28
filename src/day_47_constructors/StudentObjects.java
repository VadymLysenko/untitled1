package day_47_constructors;

public class StudentObjects {

    public static void main(String[] args) {

        Student st1 = new Student(); // runs no-args constructor
        Student st2 = new Student(); // runs no-args constructor

        Student st3 = new Student("BABAJAGA");
        Student st4 = new Student("KASHEJ");

        Student st5 = new Student("Vadym", 32);
        Student st6 = new Student(32);


    }
}
