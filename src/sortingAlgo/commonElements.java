package sortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class commonElements {
    static void main(String[] args) {
        int[] arr1 = {3, 4, 2, 2, 4};
        int[] arr2 = {3, 2, 2, 7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        int i = 0; int j = 0;

        while(i < n  && j <m){
            if(arr1[i] == arr2[j]){
                ans.add(arr1[i]);
                i++;
                j++;
            } else if(arr1[i] < arr2[j]){
                i++;
            } else { // arr1[i] > arr2[j]
                j++;
            }
        }

        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
