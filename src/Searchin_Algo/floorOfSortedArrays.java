package Searchin_Algo;

public class floorOfSortedArrays {
    static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;

        int n = arr.length;

        int low = 0;
        int high = n-1;
        int idx = -1;

        int found = -1;

        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x){
                high = mid - 1;
            }
            else if(arr[mid] <= x){
                idx = mid;
                low = mid + 1;
                found = mid;
            }
        }

        System.out.println(found);
    }
}
