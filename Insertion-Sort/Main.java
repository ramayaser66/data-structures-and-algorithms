package com.example.insertionsort;

import java.util.Arrays;

public class Main {
    public static void main(String args []){

        Insertionsort insertionsort = new Insertionsort();

        int[] testArray1 = {8,4,23,42,16,15};
        int[] testArray2 = {20,18,12,8,5,-2};
        int[] testArray3 = {5,12,7,5,5,7};
        int[] testArray4 = {2,3,5,7,13,11};
        int[] testArray5 = {};

//        insertionsort.InsertionSort(testArray1);

        System.out.println(Arrays.toString(insertionsort.InsertionSort(testArray1)));
        System.out.println(Arrays.toString(insertionsort.InsertionSort(testArray2)));
        System.out.println(Arrays.toString(insertionsort.InsertionSort(testArray3)));
        System.out.println(Arrays.toString(insertionsort.InsertionSort(testArray4)));
        System.out.println(Arrays.toString(insertionsort.InsertionSort(testArray5)));

    }
}
