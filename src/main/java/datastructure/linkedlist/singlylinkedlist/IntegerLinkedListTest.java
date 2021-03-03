package datastructure.linkedlist.singlylinkedlist;

public class IntegerLinkedListTest {

    public static void main(String[] args) {
        IntegerLinkedList list = new IntegerLinkedList();

        list.insertSorted(3);
        list.printList();
        System.out.println("");
        list.insertSorted(2);
        list.printList();
        System.out.println("");
        list.insertSorted(7);
        list.printList();
    }
}
