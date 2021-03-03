package datastructure.stack;

import javax.sound.midi.Soundbank;

public class ArrayStackTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mukesh", "Kumar", 123);
        Employee emp2 = new Employee("Tarun", "Kumar", 456);
        Employee emp3 = new Employee("Sneha", "Singh", 789);
        Employee emp4 = new Employee("Anu", "Singh", 258);
        Employee emp5 = new Employee("Test", "Test", 256);

        ArrayStack stack = new ArrayStack(10);

        stack.push(emp1);
        stack.push(emp2);
        stack.push(emp3);
        stack.push(emp4);
        stack.push(emp5);

        //stack.printStack();

        System.out.println(stack.peek());
        stack.printStack();

        System.out.println("Popped-"+stack.pop());
        stack.printStack();

    }
}
