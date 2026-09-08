package sortingAlgo;

public class descendingBubble {
    static void main(String[] args) {
        int[] arr = {-1,3,10,2,4,5,19,12,11,-4,5};
        print(arr);

        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int swaps = 0;
            for(int j = 0; j<n-1-i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;

        }
        print(arr);
    }

    public static void print (int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
