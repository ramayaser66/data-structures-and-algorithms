package com.example.graphs;

public class Edge {

    Node node;
    int weight;

    public Edge(Node node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    public Edge(Node node) {
        this.node = node;
        this.weight = 0;
    }


    public Node getNode() {
        return node;
    }

    @Override
    public String toString() {
        return "neighbors ----->" +
                  node +
                ", weight=" + weight +
                '}';
    }
}
