package sortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class kthSmallest2 {
    public static void main(String[] args) {

        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int n = arr.length;

        int k = 4;

        Arrays.sort(arr);

       for(int i = 0; i<k; i++){
           int min = Integer.MAX_VALUE;
           int minIdx = -1;
           for(int j = i; j<n; j++){
               if(arr[j] < min) {
                   min = arr[j];
                   minIdx = j;
               }
           }

           int temp = arr[i];
           arr[i] = arr[minIdx];
           arr[minIdx] = temp;
       }

        System.out.println(arr[k-1]);
    }
}