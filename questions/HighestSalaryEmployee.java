package questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class HighestSalaryEmployee
{
    public static void main(String[] args) {
        /*
            Employees from Dev Department
            Age greater than 24
            Sorted by there salary in desc
            1st 3 Employees
            Only there Id, first Name and Last Name
            Expected Output -> [Priyanka, Nupur, Sachin]
         */

        List<String> lstEmp = Data.departments.stream()
                .filter(dt->dt.getDepartmentName().equals("Dev"))
                .flatMap(emp->emp.getEmployees().stream())
                .filter(ag->ag.getAge()>24)
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getFirstName)
                .collect(Collectors.toList());
        System.out.println(lstEmp);

    }
}
class Data{
    static private final List<Employee> empListDev = Arrays.asList(
            new Employee(1,"Rushikesh","Karkhanis",25,10000,
                    new Address("Navi Mumbai","Sanpada",400706))
            ,
            new Employee(2,"Aarju","Tripathi",24,15000,
                    new Address("Pune","Hinjewadi",500506))
            ,
            new Employee(3,"Sachin","Tendulkar",25,20000,
                    new Address("Pune","Hinjewadi",400708))
            ,
            new Employee(3,"Sachin","Narang",26,20000,
                    new Address("Pune","Hinjewadi",400708))
            ,
            new Employee(4,"Nupur","Shah",26,25000,
                    new Address("Nagpur","PremNagar",100806))
            ,
            new Employee(5,"Priyanka","Das",25,30000,
                    new Address("Kolkata","Bangur",900700))

    );
    static private final List<Employee> empListQA = Arrays.asList(
            new Employee(1,"Rajesh","Patil",28,60000,
                    new Address("Jalgoan","Kopri",401706))
            ,
            new Employee(2,"Masoom","Jain",29,75000,
                    new Address("Mumbai","Bandra",500506))
            ,
            new Employee(3,"Biju","Singh",25,80000,
                    new Address("Amritsar","Gulab Bagh",400708))
    );

    static private final List<Employee> empListDevOps = Arrays.asList(
            new Employee(1,"Javed","Shaik",28,60000,
                    new Address("Delhi","Firadabad",401706))
            ,
            new Employee(2,"Tiwari","Chandramani",29,75000,
                    new Address("Bihar","Nagar",800506))
            ,
            new Employee(3,"Nilesh","Firke",35,80000,
                    new Address("Navi Mumbai","Belapur",400708))
    );
    static private final List<Employee> empListManager = Arrays.asList(
            new Employee(1,"Rohan","Kumar",38,160000,
                    new Address("Delhi","Firadabad",401706))
            ,
            new Employee(2,"KumarPal","Jain",39,175000,
                    new Address("Bangalore","Nagar",800506))
            ,
            new Employee(3,"Mayur","Chitnis",45,180000,
                    new Address("Mumbai","Belapur",400708))
    );

    public static List<Department> departments = Arrays.asList(
            new Department(1,"Dev",empListDev),
            new Department(2,"Qa",empListQA),
            new Department(3,"DevOps",empListQA),
            new Department(4,"Manager",empListManager));
}
class Department{
    int departmentId;
    String departmentName;
    List<Employee> employees;

    public Department(int departmentId, String departmentName, List<Employee> employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

class Employee{
    int employeeId;
    String firstName;
    String lastName;
    int age;
    int salary;
    Address address;

    public Employee(int employeeId, String firstName, String lastName, int age, int salary, Address address) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                ", address=" + address +
                '}';
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
class Address{
    String city;
    String area;
    int pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    public Address(String city, String area, int pinCode) {
        this.city = city;
        this.area = area;
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}