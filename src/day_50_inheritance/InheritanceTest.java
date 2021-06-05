package day_50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Vadym";
        p1.age = 18;
        p1.talk();
        p1.walk();
        p1.work(" SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Murodil";
        t1.age = 35;
        t1.talk();
        t1.walk();
        t1.work(" as Director");
        t1.teach("java inheritance");
    }
}
