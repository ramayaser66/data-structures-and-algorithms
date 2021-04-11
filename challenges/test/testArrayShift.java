package test;

<<<<<<< HEAD
public class testArrayShift {

    import org.junit.Test;

import static org.junit.Assert.*;

    @Test
    public void testEven() {
        int[] testArray = { 1, 2, 7, 7, 4, 10 };
        int[] expected = { 1, 2 , 7, 24, 7, 4, 10 };

        assertArrayEquals("the array is even  ", expected, ArrayShift.insertShiftArray(testArray, 24));
    }

    @Test
    public void testOdd() {
        int[] testArray = {2,1,6,7,5,7,6 };
        int[] expected = {[2, 1, 6, 7, 24, 5, 7, 6]};
        assertArrayEquals("the array is odd   ", expected, ArrayShift.insertShiftArray(testArray, 24));
    }

    @Test
    public void testEmpty() {
        int[] testArray = new int[] {};
        int[] expected = { 10 };
        assertArrayEquals(" the array is empty   ", expected, ArrayShift.insertShiftArray(testArray, 10));
=======
import org.junit.Test;

import  main.ArrayShift; 


public class testArrayShift {

    @Test
    public void testMidPointArrayCase1() {
        int[] array = {2, 4, 6, 8};
        int[] resultArray = {2, 4, 5, 6, 8};
        assertArrayEquals(" even length array ", resultArray, ArrayShift.midPointArray(array, 5));
    }
    @Test
    public void testMidPointArrayCase2() {
        int[] array = {4,8,15,23,42};
        int[] resultArray = {4,8,15,16,23,42};
        assertArrayEquals(" odd length array  ", resultArray, ArrayShift.midPointArray(array, 16));
    }
    @Test
    public void testMidPointArrayCase3() {
        int [] array = new int[]{};
        int [] resultArray ={1} ;
        assertArrayEquals(" empty array ", resultArray, ArrayShift.midPointArray(array,1));
>>>>>>> cc7cc68e3e1a43f5acbd1f39f14b6ca0ed2176c4
    }


    
}
