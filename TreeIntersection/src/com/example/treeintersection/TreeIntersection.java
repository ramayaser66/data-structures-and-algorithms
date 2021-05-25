package com.example.treeintersection;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection<T> {

    public List<T> tree_intersection(BinaryTree treeOne, BinaryTree treeTwo){

        List<T> treeOneList = treeOne.PreOrder();
        List<T> treeTwoList = treeTwo.PreOrder();

        HashTableClass hashTableClass = new HashTableClass();
        List<T> resultList = new ArrayList<>();


        if((treeOne.root == null || treeTwo.root == null)){
            return null;
        }else{
            for (int i =0; i<treeOneList.size();i++){
                hashTableClass.add(treeOneList.get(i), treeOneList.get(i));
            }
            for(int i =0; i<treeTwoList.size();i++){
                if( hashTableClass.contains(treeTwoList.get(i))){
                    resultList.add(treeTwoList.get(i));
                }


            }

            }

        return resultList;
    }

}
