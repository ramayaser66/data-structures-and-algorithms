package com.example.graphs;

public class Main {

    public static void main(String[] args){

        Graphs testGraph = new Graphs();





        Node FirstNode = testGraph.AddNode("A");
        Node SecondNode = testGraph.AddNode("B");
        Node ThirdNode = testGraph.AddNode("C");
        Node fourthNode = testGraph.AddNode("D");
        Node fifthNode = testGraph.AddNode("E");
        Node sixthNode = testGraph.AddNode("F");
        Node SeventhNode = testGraph.AddNode("G");


//        Node Node = new Node(5);




//
//        System.out.println(testGraph.AddNode(1));
//        System.out.println(testGraph.AddNode(2));
//        System.out.println("***************************************");



        testGraph.AddEdge(FirstNode, SecondNode, 0);
        testGraph.AddEdge(FirstNode, SecondNode, 5);
        testGraph.AddEdge(SecondNode, fourthNode, 10);
        testGraph.AddEdge(SecondNode, ThirdNode, 6);
        testGraph.AddEdge(ThirdNode,fifthNode , 9);
        testGraph.AddEdge(ThirdNode,SeventhNode , 9);
        testGraph.AddEdge(sixthNode,SeventhNode , 9);
//
//        System.out.println(testGraph.Size());

//        System.out.println(testGraph.GetNodes());

        System.out.println(testGraph.BreadthFirst(FirstNode));

        // for empty graphs
//        System.out.println(testGraph.BreadthFirst(Node));
//
//
//
//
//        System.out.println(testGraph.GetNeighbors(FirstNode));

//        System.out.println(testGraph.GetNodes());



    }






}
