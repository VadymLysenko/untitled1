package day_43_list_custom_classes;

public class Person {
    //Data -> variables
    String firstName; // this is template now
    int age;
    String email;
    char gender;
    //behaviour
    public void speak(){
        System.out.println("Person is speaking");
    }

}
class People{ // class for running main method
    public static void main(String[] args) {
        // we create object of Person class - Instantiation Person class
        Person person1 = new Person();
        person1.firstName = "Vadym";
        person1.age = 32;
        person1.email = "vadym@hotmail.com";
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.email);
        System.out.println("gender is = " + person1.gender);

        Person person2 = new Person();
        person2.firstName = "John";
        person2.age = 25;
        person2.email = "john@hotmail.com";
        person2.gender = 'M';
        person2.speak();


        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.email);
        System.out.println("gender = " + person2.gender);

    }
}
