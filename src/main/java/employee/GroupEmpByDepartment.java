package employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupEmpByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Group Employees by Department Using Streams groupingBy()
        Map<String, List<Employee>> empByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees grouped by Department:");
        System.out.println(empByDept);

        //Group by Department and Get Names Only
        Map<String, List<String>> empNamesByDept = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println("Employee Names grouped by Department:");
        System.out.println(empNamesByDept);

        //Group and Count Employees per Department
        Map<String, Long> empCountByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Employee Count by Department:");
        System.out.println(empCountByDept);
    }
}
