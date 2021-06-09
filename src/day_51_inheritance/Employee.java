package day_51_inheritance;

public class Employee extends Object { // this is grandParent for all java classes
    String jobTitle;

    public double calculateSalary(double hourlyRate) {
        return 52 * 40 * hourlyRate * 1.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
