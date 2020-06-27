package datastructure.list;

import java.util.List;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector();
        employeeList.add(new Employee("Mukesh", "Kumar", 123));
        employeeList.add(new Employee("Tarun", "Kumar", 456));
        employeeList.add(new Employee("Sneha", "Singh", 789));
        employeeList.add(new Employee("Anu", "Singh", 258));

        employeeList.forEach(employee -> System.out.println(employee));
    }
}
