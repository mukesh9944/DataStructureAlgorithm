package datastructure.problem.binarytree;

public class FindTheKthLargestElementInBST {

    Node root;
    int count = 0;

    public static void main(String[] args) {
        FindTheKthLargestElementInBST tree = new FindTheKthLargestElementInBST();
        tree.root = new Node(22);
        tree.root.left = new Node(14);
        tree.root.left.left = new Node(13);
        tree.root.right = new Node(25);
        tree.root.right.left = new Node(23);
        tree.root.right.right = new Node(32);
        tree.root.right.right.left = new Node(28);
        tree.root.right.right.left.left = new Node(26);
        tree.root.right.right.right = new Node(40);

        tree.findKthLargestElementInBST(tree.root, 1);
    }

    private void findKthLargestElementInBST(Node node, int k) {
        if (node == null) {
            return;
        }
        findKthLargestElementInBST(node.right, k);
        count++;
        if (count == k) {
            System.out.println(node.data);
        }
        findKthLargestElementInBST(node.left, k);
    }
}


