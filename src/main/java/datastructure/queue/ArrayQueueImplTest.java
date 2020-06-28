package datastructure.queue;

public class ArrayQueueImplTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 123);
        Employee emp2 = new Employee("Tarun", "Kumar", 456);
        Employee emp3 = new Employee("Sneha", "Singh", 789);
        Employee emp4 = new Employee("Anu", "Singh", 258);
        Employee emp5 = new Employee("Test", "Test", 256);

        ArrayQueueImpl queue = new ArrayQueueImpl(10);

        queue.add(emp1);
        queue.add(emp2);
        queue.add(emp3);
        queue.add(emp4);
        queue.printQueue();
        System.out.println("");
        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println("");
        queue.add(emp5);

        System.out.println("peek"+queue.peek());
        System.out.println("");
        queue.printQueue();


    }


}
