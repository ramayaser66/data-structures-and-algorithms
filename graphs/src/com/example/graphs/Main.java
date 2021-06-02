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







        Graphs graph = new Graphs();
//        Node a = graph.AddNode("a");
//        Node b = graph.AddNode("b");
//        Node c = graph.AddNode("c");
//        Node d = graph.AddNode("d");
//        Node e = graph.AddNode("e");
//        Node f = graph.AddNode("f");
//        Node h = graph.AddNode("h");
//        Node g = graph.AddNode("g");
//        graph.AddEdge(a,b,10);
//        graph.AddEdge(a,d,15);
//        graph.AddEdge(b,c,8);
//        graph.AddEdge(b,d,8);
//        graph.AddEdge(c,g,5);
//        graph.AddEdge(d,f,8);
//        graph.AddEdge(d,h,8);
//        graph.AddEdge(d,e,8);
//        graph.AddEdge(f,h,8);

//        List<Node> res = graph.depthFirst(a);

//
//        System.out.println(graph.BreadthFirst(a));
//        System.out.println(graph.DepthFirst(a));
//        System.out.println(testGraph.DepthFirst(FirstNode));

//        String result = "";
//        for (int i = 0; i < res.size(); i++) {
//            result += res.get(i).value+" ";
//        }
//        System.out.println(result);
//
//        System.out.println("**********************");
//
//        List<Node> bfsres = graph.breadthFirst(a);
//        String bfsresult = "";
//        for(Node stock : bfsres){
//            bfsresult+= st


















        // for empty graphs
//        System.out.println(testGraph.BreadthFirst(Node));
//
//
//
//
//        System.out.println(testGraph.GetNeighbors(FirstNode));

//        System.out.println(testGraph.GetNodes());



        // challenge- Get Edge
        Graphs test = new Graphs();
        Graphs testGraphI = new Graphs();




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
       city.add("Metroville");
       city.add("Pandora");

        ArrayList<String> city2 = new ArrayList();
        city2.add("Arendelle");
        city2.add("Monstropolis");
        city2.add("Naboo");

        ArrayList<String> city3 = new ArrayList();
        city3.add("Naboo");
        city3.add("Pandora");


        ArrayList<String> city4= new ArrayList();
        city4.add("Narnia");
        city4.add("Arendelle");
        city4.add("Naboo");




//        System.out.println(testGraphI.GetEdge(test,city));
//        System.out.println(testGraphI.GetEdge(test,city2));
//        System.out.println(testGraphI.GetEdge(test,city3));
//        System.out.println(testGraphI.GetEdge(test,city4));


    }

}
