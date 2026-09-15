package Searchin_Algo;

public class searchInSortedArray {
    static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3}; // output = 8;
        int tar = 3;

        int ans = searchInSorted(arr , tar);

        System.out.println(ans);
    }

    public static int searchInSorted(int[] arr , int tar) {
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == tar) return mid;
            else if(arr[low] <= arr[mid]) { // low to mid is sorted means left part is sorted
                if(arr[low] <= tar && tar < arr[mid]){
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
            else { // mid to right is sorted means right part is sorted
                if(arr[mid] < tar && tar <= arr[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
