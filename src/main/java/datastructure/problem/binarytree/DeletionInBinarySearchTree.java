package datastructure.problem.binarytree;

public class DeletionInBinarySearchTree {

    Node root;

    public static void main(String[] args) {
        DeletionInBinarySearchTree tree = new DeletionInBinarySearchTree();
        tree.root = new Node(6);
        tree.root.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(10);
        tree.root.right.left = new Node(8);
        tree.root.right.right = new Node(12);
        tree.root.right.right.left = new Node(11);
        tree.root.right.right.left.right = new Node(15);
        tree.printInOrder(tree.root);
        System.out.println("\n");
        Node node = tree.delete(tree.root, 4);

        tree.printInOrder(node);
    }

    private Node delete(Node node, int value) {
        if (node == null) {
            return node;
        } else if (value < node.data) {
            node.left = delete(node.left, value);
        } else if (value > node.data) {
            node.right = delete(node.right, value);
        } else {
            if (node.left == null && node.right == null) {
                node = null;
                return node;
            } else if (node.left == null) {
                Node temp = node;
                node = node.right;
                temp = null;
                return node;
            } else if (node.right == null) {
                Node temp = node;
                node = node.left;
                temp = null;
                return node;
            } else {
                Node temp = findInorderSuccessor(node.right);
                node.data = temp.data;
                node.right = delete(node.right, temp.data);
            }
        }
        return node;

    }

    private Node findInorderSuccessor(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private void printInOrder(Node node) {
        if (node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data + "\t");
        printInOrder(node.right);

    }
}
