package Recursion;

public class ReverseAnArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArr(arr);
        int n = arr.length;
        int i = 0;
        int j = n-1;
        ReverseArr(arr , i,j);

        printArr(arr);

    }

    public static void ReverseArr(int[] arr, int i , int j){
        if(i >= j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        ReverseArr(arr , i+1, j-1);
    }

    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
