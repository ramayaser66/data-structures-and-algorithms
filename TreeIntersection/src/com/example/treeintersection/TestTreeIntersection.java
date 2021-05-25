package com.example.treeintersection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TestTreeIntersection<T> {


    @Test
    public void testTree_intersection(){

        HashTableClass hashTableClass = new HashTableClass();
        TreeIntersection treeIntersection = new TreeIntersection();


        BinaryTree  treeOne = new BinaryTree ();

        treeOne.add(150);
        treeOne.add(100);
        treeOne.add(250);
        treeOne.add(75);
        treeOne.add(160);
        treeOne.add(200);
        treeOne.add(350);
        treeOne.add(125);
        treeOne.add(175);
        treeOne.add(300);
        treeOne.add(500);


        BinaryTree  treeTwo = new BinaryTree ();

        treeTwo.add(42);
        treeTwo.add(100);
        treeTwo.add(600);
        treeTwo.add(15);
        treeTwo.add(160);
        treeTwo.add(200);
        treeTwo.add(350);
        treeTwo.add(125);
        treeTwo.add(175);
        treeTwo.add(4);
        treeTwo.add(500);

        List<Integer> expected = new ArrayList<>();
        expected.add(100);
        expected.add(160);
        expected.add(125);
        expected.add(200);
        expected.add(175);
        expected.add(350);
        expected.add(500);

        assertEquals("testing Normal with the same size case", expected,treeIntersection.tree_intersection(treeOne, treeTwo));
    }


    @Test
    public void testUnEqualTree_intersection(){

        HashTableClass hashTableClass = new HashTableClass();
        TreeIntersection treeIntersection = new TreeIntersection();


        BinaryTree  treeOne = new BinaryTree ();


        treeOne.add(200);
        treeOne.add(350);
        treeOne.add(125);
        treeOne.add(175);
        treeOne.add(300);
        treeOne.add(500);


        BinaryTree  treeTwo = new BinaryTree ();

        treeTwo.add(42);
        treeTwo.add(100);
        treeTwo.add(600);
        treeTwo.add(15);
        treeTwo.add(160);
        treeTwo.add(200);
        treeTwo.add(350);
        treeTwo.add(125);
        treeTwo.add(175);
        treeTwo.add(4);
        treeTwo.add(500);

        List<Integer> expected = new ArrayList<>();
        expected.add(125);
        expected.add(200);
        expected.add(175);
        expected.add(350);
        expected.add(500);


        assertEquals("testing when trees have  different sizes case", expected,treeIntersection.tree_intersection(treeOne, treeTwo));
    }












    @Test
    public void testOneTreeIsEmptyTree_intersection(){

        HashTableClass hashTableClass = new HashTableClass();
        TreeIntersection treeIntersection = new TreeIntersection();
        BinaryTree  treeOne = new BinaryTree ();

        BinaryTree  treeTwo = new BinaryTree ();

        treeTwo.add(42);
        treeTwo.add(100);
        treeTwo.add(600);
        treeTwo.add(15);
        treeTwo.add(160);
        treeTwo.add(200);
        treeTwo.add(350);
        treeTwo.add(125);
        treeTwo.add(175);
        treeTwo.add(4);
        treeTwo.add(500);


        assertEquals("testing when one of the trees is empty ", null,treeIntersection.tree_intersection(treeOne, treeTwo));
    }












    @Test
    public void testEmptyTrees_intersection(){

        HashTableClass hashTableClass = new HashTableClass();
        TreeIntersection treeIntersection = new TreeIntersection();
        BinaryTree  treeOne = new BinaryTree ();

        BinaryTree  treeTwo = new BinaryTree ();

        assertEquals("testing when both trees are empty case", null,treeIntersection.tree_intersection(treeOne, treeTwo));
    }
}
