package sortingAlgo;

public class findLargestFirst {
    static void main(String[] args) {
        int[] arr = {-1,3,10,2,4,5,19,12,11,-4,5};
        int n = arr.length;

        for(int i = n-1; i > 0 ; i--){
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;

            for(int j = 0; j <= i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    maxIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        print(arr);
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
