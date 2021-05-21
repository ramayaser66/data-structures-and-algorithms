import java.util.Arrays;

public class MergeSort {




   public int[] Mergesort(int[] arr){
       int n = arr.length;
//       System.out.println(n);

       if(n > 1){
           int mid = n/2;
           int[] left = new int[mid];
           int[] right =new int[n-mid];

           for(int j = mid; j< n; j++){

               right[j-mid] = arr[j];
           }

           for(int i =0; i< arr.length/2; i++){

               left[i] = arr[i];

           }
           Mergesort(right);
           Mergesort(left);
           Merge(left, right, arr);
       }
return arr;
   }


   public int[] Merge(int[] left, int[] right, int[] arr){

       int i = 0;
       int j = 0;
       int k = 0;

       while ( i < left.length && j < right.length){
           if (left[i] <= right[j]){
               arr[k] = left[i];
               i = i + 1;
           }else{
               arr[k] = right[j];
               j = j + 1;
           }
           k = k + 1;
       }

       if (i == left.length){
           while(j < right.length){
               arr[k] = right[j];
               j = j + 1;
               k = k + 1;
           }

       }else if(j == right.length){
           while(i < left.length){
               arr[k] = left[i];
               i = i + 1;
               k = k + 1;

           }
       }
//       System.out.println(Arrays.toString(arr));
       return arr;
   }

}
