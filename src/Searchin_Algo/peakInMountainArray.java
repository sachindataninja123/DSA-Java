package Searchin_Algo;

public class peakInMountainArray {
    static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 5, 6, 8, 6, 3};
        int n = arr.length;

        int found = -1;

        int low = 1; int high = n-2;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1]) {
                found =  mid;
                break;
            }
            else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) low = mid + 1;
            else high = mid - 1;
        }

        System.out.println(arr[found]);
    }
}
