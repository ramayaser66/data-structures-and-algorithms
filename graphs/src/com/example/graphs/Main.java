package com.example.graphs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        Graphs testGraph = new Graphs();
//

        Node FirstNode = testGraph.AddNode("A");
        Node SecondNode = testGraph.AddNode("B");
        Node ThirdNode = testGraph.AddNode("C");
        Node fourthNode = testGraph.AddNode("D");
        Node fifthNode = testGraph.AddNode("E");
        Node sixthNode = testGraph.AddNode("F");
        Node SeventhNode = testGraph.AddNode("h");
        Node eighthNode = testGraph.AddNode("G");


//        Node Node = new Node(5);


        testGraph.AddEdge(FirstNode, SecondNode, 0);
        testGraph.AddEdge(FirstNode, fourthNode, 5);
        testGraph.AddEdge(SecondNode,ThirdNode, 10);
        testGraph.AddEdge(SecondNode, fourthNode, 6);
        testGraph.AddEdge(ThirdNode,eighthNode , 9);
        testGraph.AddEdge(fourthNode,sixthNode , 5);
        testGraph.AddEdge(fourthNode,SeventhNode , 9);

        testGraph.AddEdge(fourthNode,fifthNode , 6);
        testGraph.AddEdge(sixthNode,SeventhNode , 9);

//        System.out.println(testGraph.Size());

//        System.out.println(testGraph.GetNodes());

//        System.out.println(testGraph.BreadthFirst(FirstNode));
        System.out.println(testGraph.DepthFirst(FirstNode));


















 // challenge- Get Edge

 Graphs test = new Graphs();

 
         GetEdge getEdgei = new GetEdge();
 
 
 
         Node Pandora = test.AddNode("Pandora");
         Node Metroville = test.AddNode("Metroville");
         Node Arendelle = test.AddNode("Arendelle");
         Node Monstropolis = test.AddNode("Monstropolis");
         Node Narnia = test.AddNode("Narnia");
         Node Naboo = test.AddNode("Naboo");
 
 
         test.AddEdge(Pandora,Metroville,82);
         test.AddEdge(Pandora,Arendelle,150);
 
 
         test.AddEdge(Metroville,Arendelle,99);
         test.AddEdge(Metroville,Narnia,37);
         test.AddEdge(Metroville,Monstropolis,105);
         test.AddEdge(Metroville,Naboo,26);
 
         test.AddEdge(Arendelle,Monstropolis,42);
 
         test.AddEdge(Monstropolis,Naboo,73);
 
         test.AddEdge(Narnia,Naboo,250);
 
 
 
 
 
 
        ArrayList<String> city = new ArrayList();
 
        city.add("Pandora");
         city.add("Metroville");
 
         ArrayList<String> city2 = new ArrayList();
         city2.add("Arendelle");
         city2.add("Monstropolis");
         city2.add("Naboo");
 
         ArrayList<String> city3 = new ArrayList();
         city3.add("Naboo");
         city3.add("Pandora");
 
 //
         ArrayList<String> city4= new ArrayList();
         city4.add("Narnia");
         city4.add("Arendelle");
         city4.add("Naboo");
 
 
 
 
         System.out.println(getEdgei.getEdge( test,city));
         System.out.println(getEdgei.getEdge(test,city2));
         System.out.println(getEdgei.getEdge(test,city3));
         System.out.println(getEdgei.getEdge(test,city4));


    }

}
