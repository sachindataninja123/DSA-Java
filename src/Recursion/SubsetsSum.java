package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsSum {
    static void main(String[] args) {
        int[] arr = {1,2,1}; // output  [0, 1, 1, 2, 2, 3, 3, 4]
        int sum = 0;
        List <Integer> ans = new ArrayList<>();
        subsets(ans, arr , 0, sum );

        System.out.println(ans);

    }

    public static void subsets(List<Integer> ans,  int[] arr , int idx, int sum){
        if(idx == arr.length) {
            ans.add(sum);
            return;
        }
        int num = arr[idx];
        subsets(ans , arr ,  idx + 1, sum + num); //pick

        subsets(ans , arr , idx + 1, sum); // skip
    }
}
