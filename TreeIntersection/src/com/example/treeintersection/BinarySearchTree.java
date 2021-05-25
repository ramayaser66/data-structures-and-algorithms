package com.example.treeintersection;

public class BinarySearchTree<T extends Comparable> {

    NodeTree root;



//        if the new node's value is lower than the current node's, we go to the left child
//        if the new node's value is greater than the current node's, we go to the right child
//        when the current node is null, we've reached a leaf node and we can insert the new node in that position


    public BinarySearchTree () {
        this.root = null;
    }

    public void add(T value) {
        root = addToTree(root, value);
    }


    public NodeTree addToTree(NodeTree nodeTree, T value) {
try {
    if (nodeTree == null) {
        return new NodeTree(value);
    } else if (value.compareTo(nodeTree.value) >0 ) {
        nodeTree.right = addToTree(nodeTree.right, value);

    } else if (value.compareTo(nodeTree.value) <= 0) {
        nodeTree.left = addToTree(nodeTree.left, value);

    } else {
        // value already exists
        return nodeTree;
    }
    return nodeTree;
}catch (Exception ex){
    throw new NullPointerException("an error adding to the tree...");
}
    }

//    Here, we're searching for the value by comparing it to the
//    value in the current node, then continue in the left or right child depending on that.

    public boolean contains(T value) {

        return containsNode(root, value);
    }

    public boolean containsNode(NodeTree nodeTree, T value) {
        try {
            if (nodeTree == null) {
                return false;
            }
            if (value == nodeTree.value) {
                return true;
            }
            return value.compareTo(nodeTree.value) < 0
                    ? containsNode(nodeTree.left, value)
                    : containsNode(nodeTree.right, value);
        } catch(Exception ex){
            throw new NullPointerException("an error adding to the tree...");

        }

    }



}
