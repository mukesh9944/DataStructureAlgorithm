package datastructure.problem.binarytree;

public class HeightBalancedTree {
    Node root;
    int count = 0;
    public static void main(String[] args) {
        HeightBalancedTree tree = new HeightBalancedTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.right = new Node(3);
//    tree.root.left.left = new Node(4);
//    tree.root.left.right = new Node(5);
//    tree.root.left.right.left = new Node(8);
//    tree.root.right.left = new Node(6);
//    tree.root.right.right = new Node(7);

        System.out.println(tree.isTreeBalanced(tree.root));
    }

    private boolean isTreeBalanced(Node node) {
        if(node == null){
            return true;
        }
        int left = findHeight(node.left);
        count = 0;
        int right = findHeight(node.right);

        if(Math.abs(left-right) <= 1 && isTreeBalanced(node.left) && isTreeBalanced(node.right)){
            return true;
        }

        return false;
    }

    private int findHeight(Node node) {
        if(node == null){
            return 0;
        }
        findHeight(node.left);
        count++;
        findHeight(node.right);
        return count;
    }

}
