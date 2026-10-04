package Recursion;

public class PartitionEqualSubsetSum {
    static void main(String[] args) {
        int[] arr = {1,5,11,5};
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }

        if(sum % 2 != 0){
            System.out.println(false);
            return;
        }

        int target = sum / 2;

        System.out.println(canPartition(arr, 0, target));

    }

    public static boolean canPartition(int[] arr , int idx, int target){
        if(idx == arr.length){
            return true;
        }
        return canPartition(arr, idx+1, target - arr[idx]) ||
         canPartition(arr, idx+1, target);
    }
}
