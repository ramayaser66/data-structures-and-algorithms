/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;


import org.junit.Test;

import javax.swing.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test  public void testEmptyTree(){

        BinaryTree  myTree = new BinaryTree ();

        assertTrue("testing Empty Tree", myTree.root == null);
    }
//
    @Test  public void testSingleRootNodeTree(){
        BinaryTree  myTree = new BinaryTree();
        myTree.add(5);

            List<Integer> expected = new ArrayList<>();
            expected.add(5);

        assertEquals("testing single root node ",expected.size(), myTree.PreOrder().size());
    }

    @Test  public void testAddingTree(){
        BinaryTree  myTree = new BinaryTree(7);
        myTree.add(8);
        myTree.add(6);


//        [7, 6, 8]
//[6, 7, 8]
//[6, 8, 7]

    List<Integer> expected = new ArrayList<>();
    expected.add(7);
    expected.add(6);
    expected.add(8);

        assertEquals("testing single root node ",expected, myTree.PreOrder());
    }

    @Test  public void testAddingTreePreOrder(){
        BinaryTree  myTree = new BinaryTree();
        myTree.add(7);
        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(9);


//[7, 6, 8, 10, 9]

        List<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        expected.add(9);

        assertEquals("testing pre-ordered root node ",expected, myTree.PreOrder());
    }


    @Test  public void testAddingTreeInOrder(){
        BinaryTree  myTree = new BinaryTree();
        myTree.add(7);
        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(9);


//   [6, 7, 8, 9, 10]


        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);

        assertEquals("testing in-ordered root node ",expected, myTree.inOrder());
    }

    @Test  public void testAddingTreePostOrder(){
        BinaryTree  myTree = new BinaryTree();
        myTree.add(7);
        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(9);


//[6, 9, 10, 8, 7]

        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(9);
        expected.add(10);
        expected.add(8);
        expected.add(7);

        assertEquals("testing post-ordered root node ",expected, myTree.PostOrder());
    }

    // challenge-16

    @Test  public void testMaximumValue(){
        BinaryTree  myTree = new BinaryTree();
        myTree.add(7);
        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(9);


//        myTree.add(10);
//        myTree.add(10);
//        myTree.add(10);
//        myTree.add(10);
//        myTree.add(10);
//        myTree.add(10);



         int expected = 10;

        assertEquals("testing finding the maximum value in a tree ",expected, myTree.findMaximumValue());
    }

    @Test  public void testMaximumValueForRepeatedValues(){
        BinaryTree  myTree = new BinaryTree();

        myTree.add(10);
        myTree.add(10);
        myTree.add(10);
        myTree.add(10);
        myTree.add(10);
        myTree.add(10);

        int expected = 10;

        assertEquals("testing finding the maximum value in a tree that holds Repeated Values ",expected, myTree.findMaximumValue());
    }


    @Test(expected = NullPointerException.class)
    public void treeIsEmpty(){
    BinaryTree  myTree = new BinaryTree();

        assertEquals(new NullPointerException(), myTree.findMaximumValue());
    }

    //challenge-17


    @Test  public void testBreadthFisrt(){
        BinaryTree  myTree = new BinaryTree();

        myTree.add(7);
        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(10);
        myTree.add(-10);


        List<Integer> expected = new ArrayList();
        expected.add(7);
        expected.add(6);
        expected.add(8);
        expected.add(-10);
        expected.add(10);
        expected.add(10);

        assertEquals(expected, myTree.breadthFirst(myTree.root));
    }



    @Test(expected = NullPointerException.class)
    public void breadthFisrtTreeIsEmpty(){
        BinaryTree  myTree = new BinaryTree();

        assertEquals(new NullPointerException("the tree is empty"), myTree.breadthFirst(myTree.root));
    }



    @Test  public void testBreadthFisrtForRepeatedValues(){
        BinaryTree  myTree = new BinaryTree();

        myTree.add(10);
        myTree.add(10);
        myTree.add(10);


        List<Integer> expected = new ArrayList();
        expected.add(10);
        expected.add(10);
        expected.add(10);

        assertEquals(expected, myTree.breadthFirst(myTree.root));
    }


    // challenge-18

    @Test  public void testFizzBuzzTree(){
        BinaryTree  myTree = new BinaryTree();

        myTree.add(7);
        myTree.add(8);
        myTree.add(6);
        myTree.add(10);
        myTree.add(10);
        myTree.add(-10);

        FizzBuzzTree test = new FizzBuzzTree();

        List<Object> expected = new ArrayList();
        expected.add("Buzz");
        expected.add("Fizz");
        expected.add(7);
        expected.add(8);
        expected.add("Buzz");
        expected.add("Buzz");

        assertEquals(expected,test.FizzBuzzTree(myTree, myTree.root).inOrder());

    }

    @Test  public void testFizzBuzzTreeBuzz(){
        BinaryTree  myTree = new BinaryTree();

        myTree.add(5);


        FizzBuzzTree test = new FizzBuzzTree();

        List<Object> expected = new ArrayList();
        expected.add("Buzz");


        assertEquals(expected,test.FizzBuzzTree(myTree, myTree.root).inOrder());

    }


    @Test  public void testFizzBuzzTreeFizz(){
        BinaryTree  myTree = new BinaryTree();

        myTree.add(3);


        FizzBuzzTree test = new FizzBuzzTree();

        List<Object> expected = new ArrayList();
        expected.add("Fizz");


        assertEquals(expected,test.FizzBuzzTree(myTree, myTree.root).inOrder());

    }

    @Test  public void testFizzBuzzTreeFizzBuzz(){
        BinaryTree  myTree = new BinaryTree();
        myTree.add(15);

        FizzBuzzTree test = new FizzBuzzTree();

        List<Object> expected = new ArrayList();
        expected.add("FizzBuzz");

        assertEquals(expected,test.FizzBuzzTree(myTree, myTree.root).inOrder());
    }


    @Test  public void testFizzBuzzTreeForRepeatedValues(){
        BinaryTree  myTree = new BinaryTree();

        myTree.add(10);
        myTree.add(10);
        myTree.add(10);

        FizzBuzzTree test = new FizzBuzzTree();

        List<String> expected = new ArrayList();
        expected.add("Buzz");
        expected.add("Buzz");
        expected.add("Buzz");



        assertEquals(expected,test.FizzBuzzTree(myTree, myTree.root).inOrder());
    }

    @Test  public void testFizzBuzzTreeForEmptyTree(){
        BinaryTree  myTree = new BinaryTree();

        FizzBuzzTree test = new FizzBuzzTree();

        List<String> expected = new ArrayList();



        assertEquals(expected,test.FizzBuzzTree(myTree, myTree.root).inOrder());
    }








}