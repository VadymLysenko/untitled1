package day_50_inheritance;

/**
 * super class
 * Parent class
 * Base class
 */
public class Person {
    String name;
    int age;

    public Person() {}

    public void walk() {
        System.out.println(name + " is walking");
    }
    public void talk() {
        System.out.println(name + " is talking");
    }
    public void work(String job) {

        System.out.println(name + " s working" + job);
    }
}
