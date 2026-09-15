package Searchin_Algo;

public class kthMissingPositiveNumber {
    static void main(String[] args) {
//        int[] arr = {2,3,4,7,11}; // output = 9
//        int k = 5;
        int[] arr = {1,2,3,4}; // output = 6
        int k = 2;

        System.out.println(kthMissing(arr , k));

    }

    public static int kthMissing(int[] arr , int k){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;

            if(missing >= k) high = mid - 1;
            else low = mid + 1;
        }
        return high + 1 + k;
    }
}
