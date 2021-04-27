package tree;

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
        Node node1 = new Node(value);
        this.root = node1;
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

    public List<T> traversePreOrder(Node node, List<T> treeList) {

        if(node == null){
            return treeList;
        }
        treeList.add((T)node.value);
        treeList = traversePreOrder(node.left, treeList);
        treeList = traversePreOrder(node.right, treeList);

        return treeList;
    }


    // inOrder

    public List<T> inOrder() {
        List<T> treeList = new ArrayList<>();


        return traverseinOrder(root, treeList);
    }

    public List<T> traverseinOrder(Node node, List<T> treeList) {

        if(node == null){
            return treeList;
        }

        treeList = traverseinOrder(node.left, treeList);
        treeList.add((T)node.value);
        treeList = traverseinOrder(node.right, treeList);

        return treeList;
    }


    // postOrder

    public List<T> PostOrder() {
        List<T> treeList = new ArrayList<>();


        return traversePostOrder(root, treeList);
    }

    public List<T> traversePostOrder(Node node, List<T> treeList) {

        if(node == null){
            return treeList;
        }

        treeList = traversePostOrder(node.left, treeList);
        treeList = traversePostOrder(node.right, treeList);
        treeList.add((T)node.value);

        return treeList;
    }


    // challenge-16

    public int findMaximumValue(){
        return maxValue(root, (Integer)root.value);
    }

    public int maxValue(Node node, int maxVal){
        if(node == null){
            return maxVal;

        }if((Integer)node.value >= maxVal  ){
            maxVal = (Integer)node.value;


        }int right = maxValue(node.right, maxVal);
         int left = maxValue(node.left, maxVal);
         if(right > left){
             maxVal = right;
         }else{
             maxVal = left;
         }
        return maxVal;


    }

    public List<T> breadthFirst(Node curr ){
        Queue<Node> breadth = new LinkedList<Node>();
      List<T> result = new ArrayList<T>();
        if(curr == null){
            throw new NullPointerException("the tree is empty");
        }else{
            breadth.add(curr);
            result.add((T)curr.value);
            while(!breadth.isEmpty()){
                Node temp = breadth.poll();
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






}





