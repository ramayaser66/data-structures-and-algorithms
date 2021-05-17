

import org.junit.Test;
import static org.junit.Assert.*;


public class TestMergeSort {

    @Test
    public void TestMergeSort(){
        MergeSort test = new MergeSort();

        int[] testArray1 = {8,4,23,42,16,15};

        int[] expected ={4, 8, 15, 16, 23, 42};

        assertArrayEquals("testing merge sort unsorted array", expected,test.Mergesort(testArray1));

    }

    @Test
    public void TestMergeSortForReverseSorted(){
        MergeSort test = new MergeSort();

        int[] testArray1 = {20,18,12,8,5,-2};

        int[] expected ={-2, 5, 8, 12, 18, 20};

        assertArrayEquals("testing merge sort Reverse array", expected,test.Mergesort(testArray1));

    }

    @Test
    public void TestMergeSortForFewUniques(){
        MergeSort test = new MergeSort();
        int[] testArray1 = {5,12,7,5,5,7};
        int[] expected ={5, 5, 5, 7, 7, 12};

        assertArrayEquals("testing merge sort Few Uniques array", expected,test.Mergesort(testArray1));

    }

    @Test
    public void TestMergeSortForNearlySorted(){
        MergeSort test = new MergeSort();

        int[] testArray1 = {2,3,5,7,13,11};
        int[] expected ={2, 3, 5, 7, 11, 13};

        assertArrayEquals("testing merge sort Nearly Sorted array", expected,test.Mergesort(testArray1));

    }

    @Test
    public void TestMergeSortForEmptyArray(){
        MergeSort test = new MergeSort();

        int[] testArray1 = {};
        int[] expected ={};

        assertArrayEquals("testing merge sort Empty array", expected,test.Mergesort(testArray1));

    }
}
