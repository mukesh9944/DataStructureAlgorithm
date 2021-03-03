package datastructure.tree;

public class TreeTest {

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(14);

        intTree.traverseInOrder();

        //intTree.delete(15);
        //intTree.delete(27);

        System.out.println("");

        intTree.traversePreOrder();
        System.out.println("");

        intTree.traversePostOrder();
    }
}
