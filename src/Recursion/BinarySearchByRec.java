package Recursion;

public class BinarySearchByRec {
    static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int tar = 9;
        int n = arr.length;

        System.out.println(recurBinarySearch(arr , tar , 0 , n-1));
    }

    public static int recurBinarySearch(int[] arr , int tar , int lo, int hi){
        if(lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;

        if(arr[mid] == tar) return mid;
        else if (arr[mid] > tar) return recurBinarySearch(arr , tar ,lo , mid - 1);
        else  return  recurBinarySearch(arr , tar ,lo+1 , hi);
    }
}
