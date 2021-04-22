package tree;

public class Node {
    int value;
    Node right;
    Node left;


    public Node(int value) {
        this.value = value;

    }

    public Node( Node right, Node left) {

        this.right = right;
        this.left = left;
    }
}


