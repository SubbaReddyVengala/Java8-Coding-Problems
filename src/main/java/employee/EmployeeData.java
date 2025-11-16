package employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        List<Employee> employees = Arrays.asList(
                new Employee("Subbareddy", "IT", 125000),
                new Employee("Swathi", "HR", 95000),
                new Employee("Kalyan", "Finance", 115000),
                new Employee("Anil", "IT", 105000)
        );
        return employees;
    }

}
