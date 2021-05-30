package com.example.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graphs {

    ArrayList<Node> myGraph;


    public Graphs() {
     this.myGraph = new ArrayList<>();
    }



    // add node method()
    public Node AddNode(Object nodeValue){
        Node newNode = new Node(nodeValue);
        myGraph.add(newNode);

        return newNode;
    }


    // AddEdge method


    public void AddEdge(Node firstNode, Node secondNode, int weight) {


        // if it doesn't have a weight
        if (myGraph.contains(firstNode)&& myGraph.contains(secondNode)) {
            if (weight == 0) {
                Edge edge = new Edge(secondNode);
                firstNode.addNeighbors(edge);
                System.out.println("if");
            } else {

                // if it has a weight

                Edge edge = new Edge(secondNode, weight);
                firstNode.addNeighbors(edge);
                System.out.println("else");
            }
        }else{
            throw new IllegalArgumentException("error");
        }
    }




    // GetNodes() method
    public ArrayList<Node> GetNodes(){
        if(myGraph.size() !=0){
            return this.myGraph;
        }
        return null;
    }



    // GetNeighbors() method

    // check using the getneighbors method if it has neighbors or not
    // aka  check  if the check node has any neighbors return them
    public ArrayList<Edge> GetNeighbors(Node checkNeighborNode){
        if(checkNeighborNode.getNeighbors().size() == 0){
            return null;

        }
        return checkNeighborNode.getNeighbors();

    }





    // Size() method
    public int Size(){
        return this.myGraph.size();
    }


    // BreadthFirst search

    public String BreadthFirst(Node node){
if(myGraph.size() == 0){
    return "empty Graph..";
}else{
    Queue graphsQueue = new LinkedList<>();

    ArrayList visited =  new ArrayList();

    graphsQueue.add(node);
    visited.add(node);

    while(!graphsQueue.isEmpty()){
        Node newNode = (Node) graphsQueue.peek();

        ArrayList<Edge> neighborsEdge = newNode.getNeighbors();

        for(Edge item: neighborsEdge){
            if(visited.contains(item.node)){
                continue;
            }else{
                graphsQueue.add(item.node);
                visited.add(item.node);


            }
        }
        graphsQueue.remove();
    }
    String strVisited = visited.toString();
    return strVisited;


}

    }















}
