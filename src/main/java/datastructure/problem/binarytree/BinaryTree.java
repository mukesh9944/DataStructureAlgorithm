package datastructure.problem.binarytree;

public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(22);
        tree.root.left = new Node(14);
        tree.root.left.left = new Node(13);
        tree.root.right = new Node(25);
        tree.root.right.left = new Node(23);
        tree.root.right.right = new Node(32);
        tree.root.right.right.left = new Node(28);
        tree.root.right.right.left.left = new Node(26);
        tree.root.right.right.right = new Node(40);

        System.out.println("------------PreOrder-------------");
        tree.printPreOrder(tree.root);
        System.out.println("\n------------InOrder-------------");
        tree.printInOrder(tree.root);
        System.out.println("\n------------PostOrder-------------");
        tree.printPostOrder(tree.root);
    }

    private void printPostOrder(Node node) {
        if(node == null){
            return;
        }

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data +"\t");
    }

    private void printInOrder(Node node) {
        if(node == null){
            return;
        }

        printInOrder(node.left);
        System.out.print(node.data +"\t");
        printInOrder(node.right);

    }

    private void printPreOrder(Node node) {
        if(node == null){
            return;
        }
        System.out.print(node.data+"\t");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

}
