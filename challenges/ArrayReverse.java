package com.example.labone;


import java.util.Arrays;


public class LabOne {
    public static void main(String[] args) {
  

        int[] array ={1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverseArray(array, array.length)));

    }


    static int[] reverseArray( int[] array, int n){
        int[] my_array = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            my_array[j - 1] = array[i];
            j = j - 1;
        }
        return my_array;



    }
}
