import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MainEmployee {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Nazrin", "Jalilova", 5000));
        employees.add(new Employee("Aysel", "Mammadova", 6200));
        employees.add(new Employee("Ali", "Hasanov", 4500));

        Function<Employee, String> formatCard =
                e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();

        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee e : employees) {
            System.out.println(
                    formatCard.apply(e) + " | Picked salary: $" + salaryPicker.apply(e)
            );
        }
    }
}