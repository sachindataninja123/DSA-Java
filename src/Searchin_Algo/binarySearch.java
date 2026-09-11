package Searchin_Algo;

public class binarySearch {
    static void main(String[] args) {

        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int n = arr.length;
        int low = 0;
        int high = n - 1;

        int found = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                found = mid;
                break;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        System.out.println("Target is found at: " + found);
    }
}