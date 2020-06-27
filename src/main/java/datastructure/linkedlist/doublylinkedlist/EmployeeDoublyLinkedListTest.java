package datastructure.linkedlist.doublylinkedlist;

import datastructure.linkedlist.Employee;

public class EmployeeDoublyLinkedListTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 123);
        Employee emp2 = new Employee("Tarun", "Kumar", 456);
        Employee emp3 = new Employee("Sneha", "Singh", 789);
        Employee emp4 = new Employee("Anu", "Singh", 258);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(emp1);
        list.addToFront(emp2);
        list.addToTail(emp4);
        list.printList();
        System.out.println("");
        //System.out.println(list.isEmpty());
        //System.out.println(list.getSize());
        //list.removeFromFront();
       // System.out.println(list.getSize());
       //list.printList();
        //list.removeFromTail();
        list.addBefore(emp3, emp1);
        System.out.println("\n"+list.getSize());
        list.printList();
    }


}
