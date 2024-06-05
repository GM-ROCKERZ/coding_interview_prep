package mediumstream_3;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String args[])
    {
        List<Student> list = Arrays.asList(
                new Student(1, "Aditya", "Mall", 30, "Male", "Mechanical Engineering", 2014, "Mumbai", 122),
                new Student(2, "Pulkith", "Singh", 26, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankita", "Patil", 25, "Female", "Computer Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Darshan", "Mukd", 23, "Male", "Instrumentation Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Satyam", "Pandey", 26, "Male", "Biotech Engineering", 2017, "Mumbai", 98)
        );

        //Group the student by department name
        Map<String ,Long> collect = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName,Collectors.counting()));
        System.out.println("Student grouped by departement :" +collect);


// find all department names
        List<String> deptName = list.stream()
                .map(dt->dt.getDepartmentName()).distinct()
                .collect(Collectors.toList());
        System.out.println("Department names "+deptName);

//        find student whose age is less than 25
        List<Student> lststu = list.stream()
                .filter(st->st.getAge()<25)
                .collect(Collectors.toList());
        System.out.println("student whose age is <25 :"+lststu);
        System.out.println();

//        find max age of student
        OptionalInt max = list.stream()
                .mapToInt(it->it.getAge())
                .max();
        System.out.println(max.getAsInt());

//        find average age of male and female student
        Map<String ,Double> avgAge = list.stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println("avg age of male and female "+avgAge);

// Find young student in all departments
        OptionalInt min = list.stream()
                .mapToInt(Student::getAge)
                .min();
        System.out.println(min.getAsInt());

//        find the senior female student in all departments
        Student stu = list.stream()
                .filter(t->t.getGender().equals("Female"))
                .max(Comparator.comparing(Student::getAge))
                .get();
        System.out.println("Senior female student is :"+stu);


//        find the list of students whose rank is between 50 and 100

        List<Student> liststu1 = list.stream()
                .filter(dt ->dt.getRank()>50 & dt.getRank()<100)
                .collect(Collectors.toList());
        System.out.println(liststu1);


//      Find the department who is having maximum number of students

        Map.Entry<String,Long> entry = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();
        System.out.println("Department having max number of student "+entry);


// find the students who stays in Mumbai and sort them by their names

        List<Student> lststu2 = list.stream()
                .filter(dt->dt.getCity().equals("Mumbai"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());
        System.out.println(lststu2);

//        find the total count of student
        long count = list.stream().count();
        System.out.println("Total count "+count);

//        Find average rank in all departments
        Map<String ,Double> avgrank = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName,Collectors.averagingInt(Student::getRank)));
        System.out.println(avgrank);
        System.out.println();

//        Find the highest rank in each department
        Map<String,Optional<Student>> collect1 = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName,Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println(collect1);

// find the second highest rank student
        Student student = list.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1).findFirst()
                .get();
        System.out.println("Student :" +student);

//        Find the ranks of student in all department in ascending order.
        Map<String,List<Student>> collect2 = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmentName,
                        Collectors.collectingAndThen(Collectors.toList(),list3->list3.stream()
                                .sorted(Comparator.comparing(Student::getRank)
                                        ).collect(Collectors.toList()))));
        System.out.println(collect2);



    }
}
