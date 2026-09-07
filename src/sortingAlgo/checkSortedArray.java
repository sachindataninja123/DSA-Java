package sortingAlgo;

public class checkSortedArray {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        boolean found = false;

        for(int i = 0; i < n-1 ; i++){
            if(arr[i] > arr[i+1]){
              found = false;
            } else {
                found = true;
            }
        }

        System.out.println(found ? "Array is sorted" : "Array is not sorted");
    }
}
