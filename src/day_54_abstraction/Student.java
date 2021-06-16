package day_54_abstraction;

public abstract class Student {

    public void code(String language) {
        System.out.println("Student coding using " + language);
    }

    public abstract void attendClass();

}

