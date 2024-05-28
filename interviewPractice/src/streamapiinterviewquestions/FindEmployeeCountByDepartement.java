package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEmployeeCountByDepartement
{
    public static void main(String args[])
    {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice","Engineering"),
                new Employee("Bob","sales"),
                new Employee("carol","Engineering"),
                new Employee("Dave","Marketing"),
                new Employee("Eve","sales")
        );

        Stream<Employee> employeeStream = employees.stream();

        Map<String,Long> employeeCountByDepartment = employeeStream
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(employeeCountByDepartment);
    }
}
