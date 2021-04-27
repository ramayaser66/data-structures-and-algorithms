package tree;

public class Node<T> {
    T value;
    Node right;
    Node left;


    public Node(T value) {
        this.value = value;

    }

    public Node( Node right, Node left) {

        this.right = right;
        this.left = left;
    }
}


