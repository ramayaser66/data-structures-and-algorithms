/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example.treeintersection;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        HashTableClass hashTableClass = new HashTableClass();

//        hashTableClass.add(10,1);
//
//        System.out.println(hashTableClass.get(10));

        BinaryTree  treeOne = new BinaryTree ();
//
//        treeOne.add(150);
//        treeOne.add(100);
//        treeOne.add(250);
//        treeOne.add(75);
//        treeOne.add(160);
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


        TreeIntersection treeIntersection = new TreeIntersection();

        System.out.println(treeIntersection.tree_intersection(treeOne, treeTwo));








//        System.out.println(myTree.breadthFirst(myTree.root));


    }




}




















