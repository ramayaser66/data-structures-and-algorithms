public class QuickSort {

public int[] QuickSort(int[] arr, int left, int right){

    if(left < right){

        int  position = partition(arr, left, right);
        QuickSort(arr, left, position - 1);
        QuickSort(arr, position + 1, right);
    }
return arr;
}

public int partition(int[] arr,int left, int right){
    int pivot = arr[right];


    int low = left-1;

    for (int i = left; i <right ; i++) {
        if(arr[i] <= pivot){
            low++;

             swap(arr, i, low);
        }

    }
    swap(arr, right, low+1);

    return low+1;
}


public void swap(int[] arr, int i, int low){
    int temp;
    temp = arr[i];
    System.out.println("************temp"+ temp);
    arr[i] = arr[low];
    System.out.println("************arr[i]"+ arr[i]);
    arr[low]= temp;
    System.out.println("************arr[low]"+ arr[low]);

}

}
