package Java8.CollectorWithJava8;

import java.util.ArrayList;
import java.util.List;

//Filter employee with its age
public class FilterEmployeeUsingAge {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        employeeList.add(new Employee(1,"Aditi",30,10000,"F","HR","Mumbai"));
        employeeList.add(new Employee(2,"Rahul",25,20000,"M","ER","Bangalore"));
        employeeList.add(new Employee(3,"Vishal",35,30000,"M","ER","Mumbai"));
        employeeList.add(new Employee(4,"Lakshmi",28,15000,"F","HR","Bangalore"));
        employeeList.add(new Employee(5,"Priya",24,90000,"F","Marketing","Delhi"));

        employeeList.stream()
                .filter(employee -> employee.getAge()>25)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
