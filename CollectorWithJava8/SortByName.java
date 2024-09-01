package Java8.CollectorWithJava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Sort employees based on salary in both ascending and descending order
public class SortByName {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee(1,"Aditi",30,10000,"F","ER","Mumbai"));
        employeeList.add(new Employee(2,"Rahul",25,20000,"M","ER","Bangalore"));
        employeeList.add(new Employee(3,"Vishal",35,30000,"M","ER","Mumbai"));
        employeeList.add(new Employee(4,"Lakshmi",28,15000,"F","HR","Bangalore"));
        employeeList.add(new Employee(5,"Priya",24,90000,"F","Marketing","Delhi"));
        employeeList.add(new Employee(6,"Vinay",28,110000,"M","ER","Mumbai"));


        //sort employee based on name in descending order
        List<Employee> sortedList=
                employeeList.stream()
                        .sorted(Comparator.comparing(Employee::getName))
                        .collect(Collectors.toList());
        //System.out.println(sortedList);
        for (Employee e:sortedList) {
            System.out.println(e);
        }
    }
}
