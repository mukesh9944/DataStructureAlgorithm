package datastructure.hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class SimpleHashTableTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 123);
        Employee emp2 = new Employee("Tarun", "Kumar", 456);
        Employee emp3 = new Employee("Sneha", "Singh", 789);
        Employee emp4 = new Employee("Anu", "Singh", 258);
        Employee emp5 = new Employee("Test", "Test", 256);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Mukesh", emp1);
        ht.put("Tarun", emp2);
        ht.put("Sneha", emp3);
        ht.put("Anu", emp4);
        //ht.put("Test",emp5);

        ht.printHashTable();

        System.out.println("Retrieve key Mukesh " + ht.get("Mukesh"));
        System.out.println("Retrieve key Sneha " + ht.get("Sneha"));

        ht.remove("Tarun");
        ht.remove("Mukesh");
        ht.printHashTable();
        System.out.println("Retrieve key Sneha " + ht.get("Sneha"));
    }
}
