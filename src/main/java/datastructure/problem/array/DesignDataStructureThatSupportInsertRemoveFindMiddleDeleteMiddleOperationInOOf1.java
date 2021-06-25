package datastructure.problem.array;

public class DesignDataStructureThatSupportInsertRemoveFindMiddleDeleteMiddleOperationInOOf1 {

    public static void main(String[] args) {
        DoubleLinkedListStack stack = new DoubleLinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printLinkedList();
        System.out.println();
        System.out.println(stack.findMiddle());
        stack.pop();
        stack.printLinkedList();
        stack.push(4);
        stack.push(5);
        stack.printLinkedList();
        stack.deleteMiddle();
        stack.printLinkedList();
    }
}

class DLL {
    DLL prev;
    DLL next;
    int value;

    DLL(int value) {
        this.value = value;
        prev = null;
        next = null;
    }
}

class DoubleLinkedListStack {
    DLL head;
    DLL middle;
    int size = 0;

    void push(int value) {
        size++;
        if (head == null) {
            head = new DLL(value);
            middle = head;
        } else {
            DLL node = new DLL(value);
            node.next = head;
            head.prev = node;
            head = node;
            if (size % 2 == 0) {
                middle = middle.prev;
            }
        }
    }

    int pop() {
        if (head == null) {
            return -1;
        }
        size--;
        int result = head.value;
        if (size == 1) {
            head = null;
            middle = null;
        } else {
            head.next.prev = null;
            head = head.next;
            if (size % 2 == 1) {
                middle = middle.next;
            }
        }
        return result;
    }

    int findMiddle() {
        return middle.value;
    }

    void deleteMiddle() {
        size--;
        if (middle.prev != null) {
            middle.prev.next = middle.next;
        }
        if (middle.next != null) {
            middle.next.prev = middle.prev;
        }
        if (size % 2 == 1) {
            middle = middle.next;
        } else {
            middle = middle.prev;
        }
    }


    public void printLinkedList() {
        System.out.println();
        DLL node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }

}
