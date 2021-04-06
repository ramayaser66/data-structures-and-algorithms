package test;

import org.junit.Test;
import static org.junit.Assert.*;
public class testBinarySearch {

    @Test public void testBinarySearch() {
        int [] arr = {4,8,15,16,23,42};
        int [] arr1 = {1, 2, 3, 5, 6, 7};
        int [] arr2 = {4,8,15,16,23,42};
 
         assertEquals("result is ", 2, App.binarySearch(arr,15));
         assertEquals("result is ", -1, App.binarySearch(arr1,4));
         assertEquals("result is ", -1, App.binarySearch(arr2,5));
     }
 
    
}
