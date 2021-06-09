package com.example.graphs;

import java.util.ArrayList;

public class GetEdge {

    public String getEdge(Graphs myGraph, ArrayList cities){
        int index = 0;
        int weight = 0;
        Boolean flag = true;

        if(myGraph.Size() !=0) {
            while (index < cities.size() - 1 && flag == true) {
                flag = false;
                //get all nodes in graph
                for (Node node : myGraph.GetNodes()) {
                    //find  city
                    if (node.value == cities.get(index)) {
                        // get the neighbors for city
                        ArrayList<Edge> neighbors = node.getNeighbors();

                        for (Edge edge : neighbors) {

                            if (edge.getNode().value == cities.get(index + 1)) {       // find dest
                                flag = true;
                                weight += (int) edge.weight;
                                break;
                            }
                        }
                    }
                }
                index++;
            }

            if (flag == true) {
                return "true, " + "$" + weight;
            } else {
                return "False, $0";
            }
        }else{
            return "empty graph";
        }

    }
}
