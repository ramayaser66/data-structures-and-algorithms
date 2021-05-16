package com.example.insertionsort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class InsertionSortTesting {

    @Test
    public void TestInsertionsort(){
        Insertionsort insertionsort = new Insertionsort();

        int[] testArray1 = {8,4,23,42,16,15};

        int[] expected ={4, 8, 15, 16, 23, 42};

        assertArrayEquals("testing inertion sort unsorted array", expected,insertionsort.InsertionSort(testArray1));

    }
    
    @Test
    public void TestInsertionSortForReverseSorted(){
        Insertionsort insertionsort = new Insertionsort();

        int[] testArray1 = {20,18,12,8,5,-2};

        int[] expected ={-2, 5, 8, 12, 18, 20};

        assertArrayEquals("testing inertion sort unsorted array", expected,insertionsort.InsertionSort(testArray1));

    }

    @Test
    public void TestInsertionSortForFewUniques(){
        Insertionsort insertionsort = new Insertionsort();

        int[] testArray1 = {5,12,7,5,5,7};
        int[] expected ={5, 5, 5, 7, 7, 12};

        assertArrayEquals("testing inertion sort unsorted array", expected,insertionsort.InsertionSort(testArray1));

    }


    @Test
    public void TestInsertionSortForNearlySorted(){
        Insertionsort insertionsort = new Insertionsort();

        int[] testArray1 = {2,3,5,7,13,11};
        int[] expected ={2, 3, 5, 7, 11, 13};

        assertArrayEquals("testing inertion sort unsorted array", expected,insertionsort.InsertionSort(testArray1));

    }


    @Test
    public void TestInsertionSortForEmptyArray(){
        Insertionsort insertionsort = new Insertionsort();

        int[] testArray1 = {};
        int[] expected ={};

        assertArrayEquals("testing inertion sort unsorted array", expected,insertionsort.InsertionSort(testArray1));

    }
}
