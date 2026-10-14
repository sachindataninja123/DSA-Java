package Questions;

import java.util.Arrays;

public class MergeSort {
    static void main(String[] args) {
        int[] arr = {1,2,4,-3,-1,22,11,20,15,60,40};

        mergeSort(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static int[] mergeSort(int[] arr){
        int n = arr.length;
        if(n == 1) return new int[n]; // array is already sorted

        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        int idx = 0;
        for(int i = 0; i < a.length; i++) a[i] = arr[idx++];
        for(int j = 0; j < b.length; j++) b[j] = arr[idx++];

        mergeSort(a); mergeSort(b);

        merge(a, b, arr);

        return arr;

    }

    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;

        while(i < a.length && j < b.length){
            if(a[i] >= b[j]) c[k++] = b[j++];
            else c[k++] = a[i++];
        }

        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
    }
}
