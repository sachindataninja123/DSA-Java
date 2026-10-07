package sortingAlgo;

import java.util.Arrays;

public class MergeSort {
    static void main(String[] args) {
        int[] arr = {2,1,34,12,21,45,11,23,66,44};
//        int[] arr = {5,1,1,2,0,0};
        mergeSort(arr);
        printArr(arr);

    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n == 1) return; // base case

        // STEP 1 : create a new empty array with size n/2
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        // STEP 2 : copy-paste array into a or b
        int idx = 0;
        for(int i = 0; i< a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i< b.length; i++) b[i] = arr[idx++];

        // STEP 3 : Apply recursion magic
        mergeSort(a);
        mergeSort(b);

        // STEP 4 : merge a or b into  array
        merge(arr, a, b);

    }

    public static void merge(int[] arr, int[] a , int[] b){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] >= b[j]) arr[k++] = b[j++];
            else arr[k++] = a[i++];
        }

        if(i == a.length){
            while (j < b.length) arr[k++] = b[j++];
        }
        if(j == b.length){
            while (i < a.length) arr[k++] = a[i++];
        }
    }

    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
