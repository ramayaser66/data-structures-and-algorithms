/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import org.junit.Test;

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







}
