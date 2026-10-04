package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetTargetProblem {
    static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        System.out.println(subsets(arr, 0, sum));
    }

    public static boolean subsets(int[] arr , int idx, int sum){
        if(sum == 0){
            return true;
        }
        if(idx == arr.length) {
            return false;
        }
        // pick
        if(subsets( arr ,  idx + 1, sum - arr[idx])){
            return true;
        }

       return subsets(arr , idx + 1, sum); // skip
    }
}
