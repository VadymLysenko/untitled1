package day_61_execptions_collections;

public class ESTests {
    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(1);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Execution completed");
    }
}
