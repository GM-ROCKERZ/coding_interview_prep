package interviewPractice.src.streamapiinterviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter
{
    public static void main(String args[])
    {
        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1("John", 12000));
        employees.add(new Employee1("Jane", 8000));
        employees.add(new Employee1("Mark", 3000));  // This should cause an exception
        employees.add(new Employee1("Lucy", 15000));
        employees.add(new Employee1("David", 5000));

        try
        {
            List<Employee1> filteredEmployees = employees.stream()
                    .peek(employee1 ->
                    {
                        if (employee1.getSalary()<5000)
                        {
                            throw new RuntimeException("salary is less than 5000 for the employee "+employee1.getName());
                        }
                    } )
                    .filter(employee1 -> employee1.getSalary()>10000)
                    .collect(Collectors.toUnmodifiableList());
            filteredEmployees.forEach(employee1 -> System.out.println(employee1.getName()+" :"+employee1.getSalary()));
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
