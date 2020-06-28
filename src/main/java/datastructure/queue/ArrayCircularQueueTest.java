package datastructure.queue;

public class ArrayCircularQueueTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 123);
        Employee emp2 = new Employee("Tarun", "Kumar", 456);
        Employee emp3 = new Employee("Sneha", "Singh", 789);
        Employee emp4 = new Employee("Anu", "Singh", 258);
        Employee emp5 = new Employee("Test", "Test", 256);

        ArrayCircularQueue queue = new ArrayCircularQueue(5);

        queue.add(emp1);
        queue.add(emp2);
        queue.remove();
        queue.add(emp3);
        queue.remove();
        queue.add(emp4);
        queue.remove();
        queue.add(emp5);
        queue.remove();
        queue.add(emp1);

        queue.printQueue();

        /*queue.add(emp1);
        queue.add(emp2);
        queue.add(emp3);
        queue.add(emp4);
        queue.add(emp5);

        queue.remove();
        queue.remove();

        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();
        queue.add(emp1);
        queue.printQueue();*/




    }


}
