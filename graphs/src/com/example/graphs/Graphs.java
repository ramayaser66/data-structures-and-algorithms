package com.example.graphs;

import java.util.*;

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
//                System.out.println("if");
            } else {
                // if it has a weight

                Edge edge = new Edge(secondNode, weight);
                firstNode.addNeighbors(edge);
//                System.out.println("else");
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
    ArrayList nodes = new ArrayList();

    graphsQueue.add(node);
    visited.add(node);

    while(!graphsQueue.isEmpty()){
        Node newNode = (Node) graphsQueue.remove();
          nodes.add(newNode);
        ArrayList<Edge> neighborsEdge = newNode.getNeighbors();

        for(Edge item: neighborsEdge){
            if(visited.contains(item.node)){
                continue;
            }else{
                graphsQueue.add(item.node);
                visited.add(item.node);
            }
        }
//        graphsQueue.remove();
    }
    String strVisited = nodes.toString();
    return strVisited;

}

    }





//GetEdge

    public String GetEdge(Graphs graph, ArrayList cityName){

        ArrayList edges = new ArrayList();

        ArrayList<Node> graphsNodes = graph.GetNodes();
        int weightSum = 0;
        boolean isAvailable = false;


        for(int i=0; i<cityName.size();i++){

            for(Node nodeI: graphsNodes){
                if(nodeI.value.equals(cityName.get(i))){
                    ArrayList<Edge> theNeighbor = nodeI.getNeighbors();
                    for(Edge currNode: theNeighbor){
                        for(Object city:cityName){
                            if(currNode.getNode().value.equals(city.toString())){
                                weightSum += currNode.weight;
                                isAvailable = true;
                                break;
                            }
                        }
                    }

                }
            }

        }

return isAvailable+","+weightSum;

    }


    // DepthFirst

    public String DepthFirst(Node node){
        if(myGraph.size() == 0){
            return "empty Graph..";
        }else{
//            Queue graphsQueue = new LinkedList<>();
            Stack graphStack =  new Stack();

            ArrayList visited =  new ArrayList();

            graphStack.push(node);
            visited.add(node);

            while(!graphStack.isEmpty()){
                Node newNode = (Node) graphStack.pop();

                ArrayList<Edge> neighborsEdge = newNode.getNeighbors();

                for(Edge item: neighborsEdge){
                    if(visited.contains(item.node)){
                        continue;
                    }else{
                        graphStack.push(item.node);
                        visited.add(item.node);
                    }
                }

            }
            String strVisited = visited.toString();
            return strVisited;

        }

    }









}
