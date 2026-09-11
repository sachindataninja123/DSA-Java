package Searchin_Algo;

public class searchInDescendingOrder {
    static void main(String[] args) {
        int[] arr = {50, 45, 43,39,33,23,20,17,13,10,9,5 ,1};
        int target = 23;

        int n = arr.length;
        int low = 0; int high = n-1;
        int found = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] > target) low = mid + 1;
            else if(arr[mid] < target) high = mid - 1;
            else {
                found = mid;
                break;
            }
        }

        System.out.println(found);
    }
}
