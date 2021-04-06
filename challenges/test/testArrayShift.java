package test;

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
    }


    
}
