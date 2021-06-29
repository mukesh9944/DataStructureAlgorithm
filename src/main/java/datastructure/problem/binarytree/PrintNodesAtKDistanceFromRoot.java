package datastructure.problem.binarytree;

public class PrintNodesAtKDistanceFromRoot {
    Node root;

    public static void main(String[] args) {

        PrintNodesAtKDistanceFromRoot tree = new PrintNodesAtKDistanceFromRoot();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(9);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(6);
        tree.root.left.right.left.left = new Node(12);
        tree.root.left.right.left.left.right = new Node(19);
        tree.root.left.right.right = new Node(7);
        tree.root.left.right.right.right = new Node(10);
        tree.root.left.right.right.right.right = new Node(11);
        tree.root.right = new Node(23);
        tree.root.right.right = new Node(32);

        int k = 3;
        findNodeKthDistanceDown(tree.root, k);
    }

    private static void findNodeKthDistanceDown(Node node, int k) {

        if(node == null){
            return;
        }
        if(k ==0){
            System.out.println(node.data);
            return;
        }else {
            findNodeKthDistanceDown(node.left, k - 1);
            findNodeKthDistanceDown(node.right, k - 1);
        }
    }
}
