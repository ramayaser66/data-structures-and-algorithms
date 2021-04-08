package test;

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
    }


    
}
