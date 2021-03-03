package algorithm.linkedlist;

public class FlatteringLinkedList {

    private Node flatterLinkedList(Node node){
        Node temp= null;
        if(node == null || node.right == null){
            return node;
        }
        node.right = flatterLinkedList(node.right);

        node = mergeList(node, node.right, temp);

        return node;
    }

    private Node mergeList(Node leftNode, Node rightNode, Node temp) {

        while(leftNode.down != null && rightNode.down != null){
            if(leftNode.data < rightNode.data){
                if(temp == null){
                    temp = leftNode;
                }
                temp.down = leftNode;
            } else {
                if(temp == null){
                    temp = rightNode;
                }
                temp.down = rightNode;
            }
        }
        while (leftNode.down != null){
            temp.right = leftNode;
        }
        while(rightNode.down != null){
            temp.down = rightNode;
        }
        return temp;
    }
}
