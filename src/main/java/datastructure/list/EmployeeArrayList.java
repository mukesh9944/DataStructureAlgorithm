package datastructure.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArrayList {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Mukesh", "Kumar", 123));
        employeeList.add(new Employee("Tarun", "Kumar", 456));
        employeeList.add(new Employee("Sneha", "Singh", 789));
        employeeList.add(new Employee("Anu", "Singh", 258));

        //System.out.println(employeeList.get(1));
        //System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("NewName", "NewLast", 555));
        employeeList.add(2, new Employee("Tarun", "Kumar", 333));


        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
        System.out.println(employeeList.contains(new Employee("Anu", "Singh", 258)));
        System.out.println(employeeList.indexOf(new Employee("Anu", "Singh", 258)));

        employeeList.remove(1);
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
