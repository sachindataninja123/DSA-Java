package sortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class kthSmallest2 {
    public static void main(String[] args) {

        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int n = arr.length;

        int k = 4;

        Arrays.sort(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println(arr[k-1]);
    }
}