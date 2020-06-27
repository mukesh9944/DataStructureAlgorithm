package datastructure.linkedlist.singlylinkedlist;

public class IntegerNode {

    Integer integer;
    IntegerNode next;

    public IntegerNode(Integer integer) {
        this.integer = integer;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return integer.toString();
    }
}
