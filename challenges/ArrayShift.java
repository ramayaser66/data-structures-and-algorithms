import java.util.Arrays;
public class ArraysShift {
   

    public static void main(String[] args) {
        int[] testArray  = {2,4,6,8};
        System.out.println(Arrays.toString(insertShiftArray(testArray, 15)));

    }
    
    public static int[] insertShiftArray(int[] arr, int value){
        int[] output = new int[arr.length+1];
        int middle = (int) Math.ceil(arr.length/2.0);
        for(int j=0; j<arr.length ;j++){
            output[j]= arr[j];
        }
        for(int i =output.length-1; i > middle ; i--){
            output[i] = output[i-1];
        }
        output[middle] = value;
        return output;


    }
}
