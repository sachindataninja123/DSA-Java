package CyclicSort;

import java.util.ArrayList;

public class ArrayDuplicates {
    static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};

        System.out.println(findDuplicates(arr));

    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;

        int i = 0;
        while(i < n){
            int idx = arr[i] - 1;
            if(arr[i] == i+1 || arr[idx] == arr[i]) i++;
            else {
                swap(arr, i, idx);
            }
        }
        for(i = 0; i < n; i++){
            if(arr[i] != i+1) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void swap(int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

}
