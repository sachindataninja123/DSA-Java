package Searchin_Algo;

public class maxCountOfnegAndpos {
    static void main(String[] args) {

        int[] arr = {-2, -1, -1, 1, 2, 3};

        int n = arr.length;

        // Find first non-negative number
        int low = 0;
        int high = n - 1;
        int neg_count = n;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] < 0) {
                low = mid + 1;
            } else {
                neg_count = mid;
                high = mid - 1;
            }
        }

        // Find first positive number
        low = 0;
        high = n - 1;

        int pos_start = n;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > 0) {
                pos_start = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int pos_count = n - pos_start;

        System.out.println(Math.max(neg_count, pos_count));
    }
}