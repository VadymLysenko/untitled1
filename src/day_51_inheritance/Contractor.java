package day_51_inheritance;

public class Contractor extends Employee {
    @Override // 1) lets everyone know that you're overriding this method
              // 2) ensures that this method is being overridden. if not, it shows ERROR
    public double calculateSalary(double hourlyRate) {
        return 50 * 40 * hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
