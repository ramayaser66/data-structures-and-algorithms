import java.util.Arrays;

public class Main {

    public static void main(String args []){

        QuickSort quickSort = new QuickSort();

        int[] testArray = {8,4,23,42,16,15};
//        int[] testArray = {20,18,12,8,5,-2};
//        int[] testArray = {5,12,7,5,5,7};
//        int[] testArray = {2,3,5,7,13,11};

        int n = testArray.length;

        System.out.println(Arrays.toString(quickSort.QuickSort(testArray,0,n-1)));

//        for (int i = 0; i <n ; i++) {
//            System.out.println(testArray[i]);
//
//        }



    }
}
