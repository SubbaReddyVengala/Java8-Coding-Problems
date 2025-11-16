package employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindSecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Using Streams with distinct() and sorted()
        Double secondHighestSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        if (secondHighestSalary != null) {
            System.out.println("The second highest salary is: " + secondHighestSalary);
        } else {
            System.out.println("There is no second highest salary.");
        }

        //Using TreeSet
        TreeSet<Double> salarySet = employees.stream()
                .map(Employee::getSalary)
                .collect(Collectors.toCollection(TreeSet::new));
        Double secondHighest = salarySet.lower(salarySet.last());
        System.out.println("The second highest salary using TreeSet is: " + secondHighest);





        

    }
}
