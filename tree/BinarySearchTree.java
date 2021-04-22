package tree;

public class BinarySearchTree {

    Node root;



//        if the new node's value is lower than the current node's, we go to the left child
//        if the new node's value is greater than the current node's, we go to the right child
//        when the current node is null, we've reached a leaf node and we can insert the new node in that position


    public BinarySearchTree () {
        this.root = null;
    }

    public void add(int value) {
        root = addToTree(root, value);
    }


    public Node addToTree(Node node, int value) {
try {
    if (node == null) {
        return new Node(value);
    } else if (value > node.value) {
        node.right = addToTree(node.right, value);

    } else if (value < node.value) {
        node.left = addToTree(node.left, value);

    } else {
        // value already exists
        return node;
    }
    return node;
}catch (Exception ex){
    throw new NullPointerException("an error adding to the tree...");
}
    }

//    Here, we're searching for the value by comparing it to the
//    value in the current node, then continue in the left or right child depending on that.

    public boolean contains(int value) {

        return containsNode(root, value);
    }

    public boolean containsNode(Node node, int value) {
        try {
            if (node == null) {
                return false;
            }
            if (value == node.value) {
                return true;
            }
            return value < node.value
                    ? containsNode(node.left, value)
                    : containsNode(node.right, value);
        } catch(Exception ex){
            throw new NullPointerException("an error adding to the tree...");

        }

    }



}
