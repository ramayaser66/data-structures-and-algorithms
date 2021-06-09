package com.example.graphs;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class TestGraphs {
    
    @Test
    public void addToGraph() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);
        String StrFirstNode = FirstNode.toString();

        String expected = " value=1";
        assertEquals("test that a Node can be successfully added to the graph",expected,StrFirstNode);
    }


    @Test
    public void addedEdgeToTheGraphWithNoWeight() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);
        Node SecondNode = test.AddNode(2);



        test.AddEdge(FirstNode, SecondNode, 0);

        String expected  = "[neighbors -----> value=2, weight=0}]";
        assertEquals("Add Edge successfully to graph with weight..",expected,test.GetNeighbors(FirstNode).toString());
    }


    @Test
    public void addedEdgeToTheGraphWithWeight() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);
        Node SecondNode = test.AddNode(2);



        test.AddEdge(FirstNode, SecondNode, 5);

        String expected  = "[neighbors -----> value=2, weight=5}]";
        assertEquals("Add Edge successfully to graph with weight..",expected,test.GetNeighbors(FirstNode).toString());
    }



    @Test
    public void retrieveFromGraph() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);
        Node SecondNode = test.AddNode(2);


        String expected = "[ value=1,  value=2]";
        assertEquals("test that a collection of all nodes can be properly retrieved from the graph",expected,test.GetNodes().toString());
    }

    @Test
    public void GetNeighborsFromGraph() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);
        Node SecondNode = test.AddNode(2);

        test.AddEdge(FirstNode, SecondNode, 5);


        String expected = "[neighbors -----> value=2, weight=5}]";
        assertEquals("test that All appropriate neighbors can be retrieved from the graph",expected,test.GetNeighbors(FirstNode).toString());
    }

    @Test
    public void GetNeighborsFromGraphWithWeight() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);
        Node SecondNode = test.AddNode(2);

        test.AddEdge(FirstNode, SecondNode,5 );


        String expected = "[neighbors -----> value=2, weight=5}]";
        assertEquals("test that All appropriate neighbors can be retrieved from the graph",expected,test.GetNeighbors(FirstNode).toString());
    }

    @Test
    public void GetNeighborsFromGraphWithoutWeight() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);
        Node SecondNode = test.AddNode(2);

        test.AddEdge(FirstNode, SecondNode,0 );


        String expected = "[neighbors -----> value=2, weight=0}]";
        assertEquals("test that All appropriate neighbors can be retrieved from the graph",expected,test.GetNeighbors(FirstNode).toString());
    }

    @Test
    public void GetGraphSize() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);
        Node SecondNode = test.AddNode(2);

        test.Size();
        int expected = 2;
        assertEquals("test the proper size is returned, representing the number of nodes in the graph",expected,test.Size());
    }




    @Test
    public void GetGraphWithOneNode() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);

        test.Size();
        int expected = 1;
        assertEquals("A graph with only one node and edge can be properly returned",expected,test.Size());
    }

    //An empty graph properly returns null

    @Test
    public void EmptyGraph() {
        Graphs test = new Graphs();

        assertNull("An empty graph properly returns null",test.GetNodes());
    }

    // bfs tests

    @Test
    public void BFSEmptyGraph() {
        Graphs test = new Graphs();
        Node Node = new Node(5);

        test.Size();
        String expected = "empty Graph..";
        assertEquals("An empty graph with BFS ",expected,test.BreadthFirst(Node));
    }

    @Test
    public void BFSOneNodeGraph() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode(1);

        test.Size();
        String expected = "[ value=1]";
        assertEquals("A graph with only one node for the BFS ",expected,test.BreadthFirst(FirstNode));
    }

    @Test
    public void BFSGraph() {
        Graphs test = new Graphs();

        Node FirstNode = test.AddNode("A");
        Node SecondNode = test.AddNode("B");
        Node ThirdNode = test.AddNode("C");
        Node fourthNode = test.AddNode("D");
        Node fifthNode = test.AddNode("E");
        Node sixthNode = test.AddNode("F");
        Node SeventhNode = test.AddNode("G");

        test.AddEdge(FirstNode, SecondNode, 0);
        test.AddEdge(FirstNode, SecondNode, 5);
        test.AddEdge(SecondNode, fourthNode, 10);
        test.AddEdge(SecondNode, ThirdNode, 6);
        test.AddEdge(ThirdNode,fifthNode , 9);
        test.AddEdge(ThirdNode,SeventhNode , 9);
        test.AddEdge(sixthNode,SeventhNode , 9);

        test.Size();
        String expected = "[ value=A,  value=B,  value=D,  value=C,  value=E,  value=G]";
        assertEquals("A graph with BFS ",expected,test.BreadthFirst(FirstNode));
    }



    // DepthFirst tests

    @Test
    public void DepthFirstEmptyGraph() {
        Graphs test = new Graphs();
        Node Node = new Node(5);

        test.Size();
        String expected = "empty Graph..";
        assertEquals("An empty graph with BFS ",expected,test.DepthFirst(Node));
    }


    @Test
    public void DepthFirstOneNodeGraph() {
        Graphs test = new Graphs();
        Node FirstNode = test.AddNode("A");

        test.Size();
        String expected = "[ value=A]";
        assertEquals("A graph with only one node for the BFS ",expected,test.DepthFirst(FirstNode));
    }

    @Test
    public void DepthFirstGraph() {
        Graphs test = new Graphs();

        Node FirstNode = test.AddNode("A");
        Node SecondNode = test.AddNode("B");
        Node ThirdNode = test.AddNode("C");
        Node fourthNode = test.AddNode("D");
        Node fifthNode = test.AddNode("E");
        Node sixthNode = test.AddNode("F");
        Node SeventhNode = test.AddNode("h");
        Node eighthNode = test.AddNode("G");

        test.AddEdge(FirstNode, SecondNode, 0);
        test.AddEdge(FirstNode, fourthNode, 5);
        test.AddEdge(SecondNode,ThirdNode, 10);
        test.AddEdge(SecondNode, fourthNode, 6);
        test.AddEdge(ThirdNode,eighthNode , 9);
        test.AddEdge(fourthNode,sixthNode , 5);
        test.AddEdge(fourthNode,SeventhNode , 9);

        test.AddEdge(fourthNode,fifthNode , 6);
        test.AddEdge(sixthNode,SeventhNode , 9);

        test.Size();
        String expected = "[ value=A,  value=B,  value=D,  value=F,  value=h,  value=E,  value=C,  value=G]";
        assertEquals("A graph with BFS ",expected,test.DepthFirst(FirstNode));
    }




    
    // test getEdge

    @Test
    public void TestGetEdgeGraph() {
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



        String expected = "true, $82";
        assertEquals(" GetEdges for a graph  ",expected,getEdgei.getEdge( test,city));
    }

    @Test
    public void TestGetEdgeGraph2() {
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
        city.add("Arendelle");
        city.add("Monstropolis");
        city.add("Naboo");


        String expected = "true, $115";
        assertEquals("Testing GetEdges for a graph  ",expected,getEdgei.getEdge( test,city));
    }



    @Test
    public void TestGetEdgeGraph3() {
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
        city.add("Naboo");
        city.add("Pandora");



        String expected = "False, $0";
        assertEquals("Testing GetEdges for a graph  ",expected,getEdgei.getEdge( test,city));
    }


    @Test
    public void TestGetEdgeGraph4() {
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
        city.add("Narnia");
        city.add("Arendelle");
        city.add("Naboo");


        String expected = "False, $0";
        assertEquals("Testing GetEdges for a graph  ",expected,getEdgei.getEdge( test,city));
    }



    @Test
    public void TestGetEdgeGraph5() {
        Graphs test = new Graphs();
        GetEdge getEdgei = new GetEdge();



        ArrayList<String> city = new ArrayList();
        city.add("Narnia");
        city.add("Arendelle");
        city.add("Naboo");


        String expected = "empty graph";
        assertEquals("Testing GetEdges for a graph  ",expected,getEdgei.getEdge( test,city));
    }







}
