package com.example.treeintersection;


public class NodeTree<T> {
    T value;
    NodeTree right;
    NodeTree left;


    public NodeTree(T value) {
        this.value = value;

    }

    public NodeTree(NodeTree right, NodeTree left) {

        this.right = right;
        this.left = left;
    }
}


