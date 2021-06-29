package datastructure.problem.binarytree;

public class BinaryTreeToDoublyLinkedListConversion {
    Node root;
    boolean globalFlag = true;
    Node parent;
    Node head;
    public static void main(String[] args) {
        BinaryTreeToDoublyLinkedListConversion tree = new BinaryTreeToDoublyLinkedListConversion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(8);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("\n------------InOrder-------------");
        tree.printInOrder(tree.root);

        tree.createLinkedList(tree.root);

        tree.printDoubleLinkedList(tree.head);

    }

    private void printDoubleLinkedList(Node node) {

            Node last = null;
            System.out.println("Traversal in forward Direction");
            while (node != null) {
                System.out.print(node.data + " ");
                last = node;
                node = node.right;
            }
            System.out.println();
            System.out.println("Traversal in reverse direction");
            while (last != null) {
                System.out.print(last.data + " ");
                last = last.left;
            }

    }

    private void createLinkedList(Node node) {
        if(node == null){
            return;
        }
        createLinkedList(node.left);
        if(globalFlag){
            parent = node;
            head = node;
            globalFlag = false;
        }else{
            node.left = parent;
            parent.right = node;
            parent = node;
        }
        createLinkedList(node.right);
    }

    private void printInOrder(Node node) {
        if(node == null){
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data +"\t");
        printInOrder(node.right);
    }
}
