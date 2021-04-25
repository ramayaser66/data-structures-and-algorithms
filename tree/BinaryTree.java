package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree extends BinarySearchTree{
//    Node root;

    public BinaryTree(){
       super();
    }

    public BinaryTree(int value) {
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

    public List<Integer> PreOrder() {
        List<Integer> treeList = new ArrayList<>();


        return traversePreOrder(root, treeList);
    }

    public List<Integer> traversePreOrder(Node node, List<Integer> treeList) {

        if(node == null){
            return treeList;
        }
        treeList.add(node.value);
        treeList = traversePreOrder(node.left, treeList);
        treeList = traversePreOrder(node.right, treeList);

        return treeList;
    }


    // inOrder

    public List<Integer> inOrder() {
        List<Integer> treeList = new ArrayList<>();


        return traverseinOrder(root, treeList);
    }

    public List<Integer> traverseinOrder(Node node, List<Integer> treeList) {

        if(node == null){
            return treeList;
        }

        treeList = traverseinOrder(node.left, treeList);
        treeList.add(node.value);
        treeList = traverseinOrder(node.right, treeList);

        return treeList;
    }


    // postOrder

    public List<Integer> PostOrder() {
        List<Integer> treeList = new ArrayList<>();


        return traversePostOrder(root, treeList);
    }

    public List<Integer> traversePostOrder(Node node, List<Integer> treeList) {

        if(node == null){
            return treeList;
        }

        treeList = traversePostOrder(node.left, treeList);
        treeList = traversePostOrder(node.right, treeList);
        treeList.add(node.value);

        return treeList;
    }


    // challenge-16

    public int findMaximumValue(){
        return maxValue(root, root.value);
    }

    public int maxValue(Node node, int value){
        if(node == null){
            return value;

        }if(node.value >= value){
            value = node.value;


        }int right = maxValue(node.right, value);
         int left = maxValue(node.left, value);
         if(right > left){
             value = right;
         }else{
             value = left;
         }
        return value;


    }



}



