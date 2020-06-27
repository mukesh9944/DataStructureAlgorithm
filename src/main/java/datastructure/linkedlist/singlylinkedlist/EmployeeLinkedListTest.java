package datastructure.linkedlist.singlylinkedlist;

import datastructure.linkedlist.Employee;

public class EmployeeLinkedListTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 123);
        Employee emp2 = new Employee("Tarun", "Kumar", 456);
        Employee emp3 = new Employee("Sneha", "Singh", 789);
        Employee emp4 = new Employee("Anu", "Singh", 258);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(emp1);
        list.addToFront(emp2);
        list.addToFront(emp3);
        list.addToFront(emp4);
        list.printList();
        System.out.println("");
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }


}
