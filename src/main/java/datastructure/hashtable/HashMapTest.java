package datastructure.hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Phaser;

public class HashMapTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 1);
        Employee emp2 = new Employee("Tarun", "Kumar", 4);
        Employee emp3 = new Employee("Sneha", "Singh", 3);
        Employee emp4 = new Employee("Anu", "Singh", 2);

        Map<String, Employee> ht = new HashMap<>();
        ht.put("Mukesh", emp1);
        ht.put("Tarun", emp2);
        ht.put("Sneha", emp3);
        ht.put("Anu", emp4);
        Employee emp = ht.putIfAbsent("Anu", emp1);
        System.out.println(emp);


        System.out.println(ht.getOrDefault("A", emp1));
        System.out.println(ht.remove("Anu"));
        /*Iterator<Employee> iterator = ht.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        ht.forEach((s, employee) -> System.out.println("Key = " + s + " , Employee = " + employee));
    }
}
