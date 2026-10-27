package CyclicSort;

import java.util.ArrayList;

public class DisappearedInArr {
    static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(disappearedInArr(arr));
    }

    public static ArrayList<Integer> disappearedInArr(int[] arr) {
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
                ans.add(i+1);
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
