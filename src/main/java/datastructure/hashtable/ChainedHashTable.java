package datastructure.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable() {
        this.hashTable = new LinkedList[5];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {
        int hashKey = hashKey(key);
        hashTable[hashKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashKey].listIterator();
        StoredEmployee employee = null;

        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                return employee.employee;
            }
        }

        return null;
    }

    public Employee remove(String key) {
        int hashKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashTable[hashKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) {
                break;
            }
        }
        if (employee == null) {
            return null;
        } else {
            hashTable[hashKey].remove(index);
            return employee.employee;
        }

    }

    private int hashKey(String key) {
        //return key.length() % hashTable.length;
        //int hashCode = Math.abs(key.hashCode() % hashTable.length);
        //System.out.println(key +"----------"+hashCode +"------"+key.hashCode());
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i].isEmpty()) {
                System.out.println("Position " + i + " : empty");
            } else {
                System.out.print("Position " + i + " : ");
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }

        }
    }
}
