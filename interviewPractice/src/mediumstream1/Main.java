package mediumstream1;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String args[])
    {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

//      find list of student whose first name start with alphabate 'A'
        List<Student> listStunam = list.stream()
                .filter(name->name.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.println("Students whose name start with A: " +listStunam);

//      Group the student by Department name
        Map<String,List<Student>> mapData = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName));
        System.out.println(mapData);
        System.out.println();

//        Find the total count of student using stream
        long countStudent = list.stream().count();
        System.out.println("Total count of student :" +countStudent);

//        Find the max age of student
        OptionalInt maxAge = list.stream()
                .mapToInt(dt->dt.getAge())
                .max();
        System.out.println("Max age of student :" + maxAge.getAsInt());

//        find all departments names
        List<String> lstDepartments = list.stream()
                .map(dt->dt.getDepartmentName())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("All distinct department names :"+lstDepartments);
        System.out.println();

//        find the list of student whose age is less than 30
        List<Student> lstStudent = list.stream()
                .filter(dt->dt.getAge()<30)
                .collect(Collectors.toList());
        System.out.println("Students whose age is less than 30 "+lstStudent);

//Find the list of students whose rank is in between 50 and 100
        List<Student> lstStu = list.stream()
                .filter(dt->dt.getRank()>50 & dt.getRank()<100)
                .collect(Collectors.toList());
        System.out.println("Students whose age is between 50 & 100 :" +lstStu);

//      Find the average age of male and female students
Map<String,Double> mapAvgAge = list.stream()
        .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println("Average age of male and female students :"+mapAvgAge);
        System.out.println();

//        Find the Students who stays in Delhi and sort them by their names
        List<Student> lstDelhi = list.stream()
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());
        System.out.println("Students who stays in delhi :"+lstDelhi);

    }

}
