package datastructure.tree;

public class Tree {

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            System.out.println("root ->"+root.getData());
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            System.out.println("root ->"+root.getData());
            root.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (root != null) {
            System.out.println("root ->"+root.getData());
            root.traversePostOrder();
        }
    }

    public Node get(int value) {
        if (root != null) {
            root.get(value);
        }
        return null;
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private Node delete(Node subTreeRoot, int value){
        if(subTreeRoot == null){
            return null;
        }

        if(value < subTreeRoot.getData()){
            subTreeRoot.setLeft(delete(subTreeRoot.getLeft(), value));
        } else if(value > subTreeRoot.getData()){
            subTreeRoot.setRight(delete(subTreeRoot.getRight(), value));
        }else{
            if(subTreeRoot.getLeft() == null){
                return subTreeRoot.getRight();
            }else if(subTreeRoot.getRight() == null){
                return subTreeRoot.getLeft();
            }

            //Case 3 : node to delete has 2 children
            //Replace the value in the subTreeRoot node with the smallest value from the right subtree
            subTreeRoot.setData(subTreeRoot.getRight().min());
            //Delete the node that has the smallest value in the right subtree
            subTreeRoot.setRight(delete(subTreeRoot.getRight(), subTreeRoot.getData()));
        }
            return subTreeRoot;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

}
