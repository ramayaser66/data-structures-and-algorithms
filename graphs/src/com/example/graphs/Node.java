package com.example.graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {

//    Node next;
    Object value;
    ArrayList<Edge> neighbors;

    public Node() {
    }

    public Node(Object value) {
        this.value = value;
//        this.next = null;

        this.neighbors = new ArrayList<Edge>();
    }



public ArrayList<Edge> getNeighbors(){
        return neighbors;
}

    public void addNeighbors(Edge newNeighbor){
        this.neighbors.add(newNeighbor);
    }


    @Override
    public String toString() {
        return
                " value=" + value ;
    }
}
