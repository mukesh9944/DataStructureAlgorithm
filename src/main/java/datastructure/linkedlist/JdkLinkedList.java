package datastructure.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class JdkLinkedList {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 123);
        Employee emp2 = new Employee("Tarun", "Kumar", 456);
        Employee emp3 = new Employee("Sneha", "Singh", 789);
        Employee emp4 = new Employee("Anu", "Singh", 258);
        Employee emp5 = new Employee("Test", "tt", 268);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(emp1);
        list.addFirst(emp2);
        list.addFirst(emp3);
        list.addFirst(emp4);


        Iterator itr = list.iterator();
        System.out.print("Head -> ");
        while (itr.hasNext()){
            System.out.print(itr.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.add(emp5); //Add at the end of the list

        itr = list.iterator();
        System.out.print("Head -> ");
        while (itr.hasNext()){
            System.out.print(itr.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeFirst();

        itr = list.iterator();
        System.out.print("Head -> ");
        while (itr.hasNext()){
            System.out.print(itr.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();

        itr = list.iterator();
        System.out.print("Head -> ");
        while (itr.hasNext()){
            System.out.print(itr.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        //list.forEach(employee -> System.out.println(employee));
    }
}
