public class BinarySearch {

    public static void main(String[] args) {
        // int [] arr ={4,8,15,16,23,42};15
        int [] arr ={1, 2, 3, 5, 6, 7};
        System.out.println(binarySearch(arr, 4));
    }




    public static int binarySearch(int[] arr, int n){

        if (arr.length == 0){
            return -1;
        }
        else{
            int low = 0;
            int high = arr.length -1;
            int mid = (low + high)/2;
    
        
            while(low <=high){
                if(arr[mid] ==n){
                    return mid;
                }
                else if (arr[mid]<n){
                    low = mid +1;
                }
                else{
                    high = mid -1;
                }
                mid = (low+high)/2;
            }
        
            return -1;
        }
       

    }
    
}
