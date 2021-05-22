package day_43_list_custom_classes;

public class Company {

    public static void main(String[] args) {

      Employee emp1 = new Employee();
      emp1.name = "Vadym";
      emp1.jobTitle = "SDET";
      emp1.work();

      Employee emp2 = new Employee();
      emp2.name = "John";
      emp2.jobTitle = "Product owner";
      emp2.work();

      Employee emp3 = new Employee();
      emp3.name = "Leo";
      emp3.jobTitle = "Developer";
      emp3.work();

      emp1.work();
    }
}
