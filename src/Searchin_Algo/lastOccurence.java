package Searchin_Algo;

public class lastOccurence {
    static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 67, 123, 125};
        int target = 5;
        int n = arr.length;
        int idx = -1;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low + high) /2;

            if(arr[mid] > target) high = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
            else {
                idx = mid;
                low = mid + 1;
            }
        }

        System.out.println("Last occurence of "+ target + " is " + idx);
    }
}
