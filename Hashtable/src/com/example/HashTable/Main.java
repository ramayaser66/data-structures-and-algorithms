package com.example.HashTable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        HashTableClass test = new HashTableClass();

        test.add(1,20);
        test.add(2,30);
//        test.add(3,40);
//        test.add(4,50);
        test.add("test",100);
        test.add("test",10);
        test.add(0,10);
        test.add("R",11);
        test.add("B",111);
//        test.add(60,111);
        test.add(100,111);

//        System.out.println(test.contains(2));
//        System.out.println(test.contains(0));
//        System.out.println(test.get(0));
//        System.out.println(test.get(3));
        System.out.println(test.get(0));
        System.out.println(test.get(100));
//        System.out.println(test.get("test"));

//        System.out.println(test.hash(4));
//        System.out.println(test.hash(2));

//
        System.out.println(test.toString());

    }

}
