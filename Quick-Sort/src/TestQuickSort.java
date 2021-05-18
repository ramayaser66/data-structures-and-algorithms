


import org.junit.Test;
import static org.junit.Assert.*;

public class TestQuickSort {


    @Test
    public void TestQuickSort(){
        QuickSort test = new QuickSort();


        int[] testArray1 = {8,4,23,42,16,15};

        int n = testArray1.length;

        int[] expected ={4, 8, 15, 16, 23, 42};

        assertArrayEquals("testing quick sort for unsorted array", expected,test.QuickSort(testArray1,0,n-1));

    }

    @Test
    public void TestQuickSortForReverseSorted(){
        QuickSort test = new QuickSort();


        int[] testArray1 =  {20,18,12,8,5,-2};
        int n = testArray1.length;
        int[] expected ={ -2, 5, 8, 12, 18,20};
        assertArrayEquals("testing quick sort for unsorted array", expected,test.QuickSort(testArray1,0,n-1));

    }

    @Test
    public void TestQuickSortForFewUniques(){
       QuickSort test = new QuickSort();


        int[] testArray1 = {5,12,7,5,5,7};
        int n = testArray1.length;
        int[] expected ={5, 5, 5, 7, 7, 12};

        assertArrayEquals("testing QuickSort for FewUniques array", expected,test.QuickSort(testArray1,0,n-1));

    }

    @Test
    public void TestQuickSortForNearlySorted(){
        QuickSort test = new QuickSort();


        int[] testArray1 = {2,3,5,7,13,11};
        int n = testArray1.length;
        int[] expected ={2, 3, 5, 7, 11, 13};

        assertArrayEquals("testing Quick sort  for nearly array",expected,test.QuickSort(testArray1,0,n-1));

    }

    @Test
    public void TestQuickSortForEmptyArray(){
        QuickSort test = new QuickSort();
        int[] testArray1 = {};
        int n = testArray1.length;
        int[] expected ={};

        assertArrayEquals("testing inertion sort unsorted array", expected,test.QuickSort(testArray1,0,n-1));

    }
}
