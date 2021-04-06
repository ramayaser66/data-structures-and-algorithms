import java.util.Arrays;

public class ArrayShift{

    public static void main(String[] args) {

        int[] arr = {1,5,6,2,4};
        System.out.println(Arrays.toString(midPointArray(arr, 2)));
        
    }

    public static int[] midPointArray (int[] arr, int n){

        int[] result = new int[arr.length+1];
        double x = arr.length/2.0;
        int midPt = (int)Math.ceil(arr.length/2.0);
        System.out.println(x);
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i]; 
        }

        for (int j= result.length-1 ; j > midPt; j--) {
            result[j] = result[j-1];

        }
        result[midPt] = n; 
        return result; 

    
    }
}