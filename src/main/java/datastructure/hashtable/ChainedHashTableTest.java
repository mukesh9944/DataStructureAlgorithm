package datastructure.hashtable;

public class ChainedHashTableTest {

        public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 1);
        Employee emp2 = new Employee("Tarun", "Kumar", 4);
        Employee emp3 = new Employee("Sneha", "Singh", 3);
        Employee emp4 = new Employee("Anu", "Singh", 2);
        Employee emp5 = new Employee("Test", "Test", 5);

        ChainedHashTable ht = new ChainedHashTable();
        ht.put("Mukesh", emp1);
        ht.put("Tarun", emp2);
        ht.put("Sneha", emp3);
        ht.put("Anu", emp4);
        //ht.put("Test",emp5);

        ht.printHashTable();

       /* System.out.println("Retrieve key Mukesh " + ht.get("Mukesh"));


        ht.remove("Tarun");
        ht.remove("Mukesh");
        ht.printHashTable();*/

    }
}

