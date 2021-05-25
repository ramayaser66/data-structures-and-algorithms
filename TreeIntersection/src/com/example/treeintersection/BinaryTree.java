package com.example.treeintersection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<T extends Comparable> extends BinarySearchTree{
//    Node root;

    public BinaryTree(){
       super();
    }

    public BinaryTree(T value) {
        NodeTree nodeTree1 = new NodeTree(value);
        this.root = nodeTree1;
    }



//    public void add(int value) {
//        root = addToTree(root, value);
//    }
//
//
//    public Node addToTree(Node node, int value) {
//
//        if (node == null) {
//            return new Node(value);
//        }
//         else if (value > node.value) {
//            node.right = addToTree(node.right, value);
//
//        } else if (value < node.value) {
//            node.left = addToTree(node.left, value);
//
//        }else {
//            // value already exists
//            return node;
//        }
//        return node;
//    }
//
//
//    public boolean contains(int value) {
//        return containsNode(root, value);
//    }
//
//    public boolean containsNode(Node node, int value) {
//        if (node == null) {
//            return false;
//        }
//        if (value == node.value) {
//            return true;
//        }
//        return value < node.value
//                ? containsNode(node.left, value)
//                : containsNode(node.right, value);
//    }


    // preOrder

    public List<T> PreOrder() {
        List<T> treeList = new ArrayList<>();


        return traversePreOrder(root, treeList);
    }

    public List<T> traversePreOrder(NodeTree nodeTree, List<T> treeList) {

        if(nodeTree == null){
            return treeList;
        }
        treeList.add((T) nodeTree.value);
        treeList = traversePreOrder(nodeTree.left, treeList);
        treeList = traversePreOrder(nodeTree.right, treeList);

        return treeList;
    }


    // inOrder

    public List<T> inOrder() {
        List<T> treeList = new ArrayList<>();


        return traverseinOrder(root, treeList);
    }

    public List<T> traverseinOrder(NodeTree nodeTree, List<T> treeList) {

        if(nodeTree == null){
            return treeList;
        }

        treeList = traverseinOrder(nodeTree.left, treeList);
        treeList.add((T) nodeTree.value);
        treeList = traverseinOrder(nodeTree.right, treeList);

        return treeList;
    }


    // postOrder

    public List<T> PostOrder() {
        List<T> treeList = new ArrayList<>();


        return traversePostOrder(root, treeList);
    }

    public List<T> traversePostOrder(NodeTree nodeTree, List<T> treeList) {

        if(nodeTree == null){
            return treeList;
        }

        treeList = traversePostOrder(nodeTree.left, treeList);
        treeList = traversePostOrder(nodeTree.right, treeList);
        treeList.add((T) nodeTree.value);

        return treeList;
    }


    // challenge-16

    public int findMaximumValue(){
        return maxValue(root, (Integer)root.value);
    }

    public int maxValue(NodeTree nodeTree, int maxVal){
        if(nodeTree == null){
            return maxVal;

        }if((Integer) nodeTree.value >= maxVal  ){
            maxVal = (Integer) nodeTree.value;


        }int right = maxValue(nodeTree.right, maxVal);
         int left = maxValue(nodeTree.left, maxVal);
         if(right > left){
             maxVal = right;
         }else{
             maxVal = left;
         }
        return maxVal;


    }

    public List<T> breadthFirst(NodeTree curr ){
        Queue<NodeTree> breadth = new LinkedList<NodeTree>();
      List<T> result = new ArrayList<T>();
        if(curr == null){
            throw new NullPointerException("the tree is empty");
        }else{
            breadth.add(curr);
            result.add((T)curr.value);
            while(!breadth.isEmpty()){
                NodeTree temp = breadth.poll();
                if(temp.left!=null){
                    breadth.add(temp.left);
                    result.add((T)temp.left.value);
                }
                if(temp.right!=null){
                    breadth.add(temp.right);
                    result.add((T)temp.right.value);
                }
            }
            return result;
        }
    }


    public int sumBinaryTree(NodeTree root){
        int sum = 0;

        if (((int)root.value % 2) !=0){
            sum = sum + (int)root.value;
        }
        if (root.left!= null){

            sum = sum + sumBinaryTree( root.left);
        }
        if (root.right!= null){
            sum = sum + sumBinaryTree( root.right);
        }
        return sum;
    }



    // challenge-19 solution 1
//    public boolean checkFolders(BinarySearchTree firstTree, BinarySearchTree secondTree){
//        return checkFoldersAlgo(firstTree.getRoot(), 0) == checkFoldersAlgo(secondTree.getRoot(), 0);
//    }
//    public int checkFoldersAlgo(Node root, int number){
//        if(root.getLeft() != null){
//            number = checkFoldersAlgo(root.getLeft(), number);
//        }
//        if(root.getRight() != null){
//            number = checkFoldersAlgo(root.getRight(), number);
//        }
//        if(root.getLeft() == null && root.getRight() == null){
//            number += 1;
//        }
//        return number;
//    }


    //challenge-19 solution 2
//    public String findNumberOfFile(BinaryTree directoryOne, BinaryTree directoryTwo){
//        int countDirectoryOne = findNumberOfFile(directoryOne.root);
//        int countDirectoryTwo = findNumberOfFile(directoryTwo.root);
//        if(countDirectoryOne != countDirectoryTwo){
//            return "Files Are Not Equal";
//        }else{
//            return "Files Are Equal";
//        }
//    }
//    public int findNumberOfFile(Node curr) {
//        int count = 0;
//        if (curr == null) {
//            return count;
//        }
////        Pattern pattern = Pattern.compile("\\.");
////        Matcher matcher = pattern.matcher((String)curr.data);
////        if(matcher.find()){
////        count++;
////    }
//        if(((String) curr.data).contains(".")){
//            count++;
//        }
//        count = count +findNumberOfFile(curr.left);
//        count = count +findNumberOfFile(curr.right);
//        return count;
//    }






}





