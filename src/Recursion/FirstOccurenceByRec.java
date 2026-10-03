package Recursion;

public class FirstOccurenceByRec {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5,6};
        int tar = 4;
        int n = arr.length;

        System.out.println(recurFirstOccurence(arr ,tar , 0 , n-1));

    }

    public static int recurFirstOccurence(int[] arr , int tar , int lo, int hi){
        if(lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;

        if(arr[mid] > tar) return recurFirstOccurence(arr , tar ,lo , mid - 1);
        else if (arr[mid] < tar) return recurFirstOccurence(arr , tar ,mid + 1 , hi);
        else {
            int left = recurFirstOccurence(arr, tar, lo, mid-1);

            if(left != -1){
                return left;
            }
            return mid;
        }
    }
}

