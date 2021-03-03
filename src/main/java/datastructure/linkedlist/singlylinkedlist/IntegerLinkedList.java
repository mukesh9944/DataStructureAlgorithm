package datastructure.linkedlist.singlylinkedlist;

import datastructure.linkedlist.Employee;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer integer){
        IntegerNode node = new IntegerNode(integer);
        node.setNext(head);
        head = node;
        size++;
    }

    public void insertSorted(Integer integer){

        if(head == null || head.getInteger() >= integer){
            addToFront(integer);
            size++;
        }else{
            IntegerNode current = head.getNext();
            IntegerNode previous = head;
            while (current != null && current.getInteger() < integer){
                previous = current;
                current = current.getNext();
            }

            IntegerNode newNode = new IntegerNode(integer);
            newNode.setNext(current);
            previous.setNext(newNode);
            size++;
        }
    }

    public void printList(){
        IntegerNode current = head;
        System.out.print("Head -> ");
        while (current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }
}
