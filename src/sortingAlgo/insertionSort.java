package sortingAlgo;

public class insertionSort {
    static void main(String[] args) {
        int[] arr = {4,7,1,15,14,9,0,2,1,45,3};
        int n = arr.length;

        for(int i = 0; i<n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
