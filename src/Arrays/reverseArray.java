package Arrays;

public class reverseArray {
    static void main(String[] args) {
        int[] arr = {12,45,32,12,34,56,78,90,-3,9};

        System.out.println("Array without reverse: ");
        print(arr);

        int n = arr.length;

        // first approach method
        int i = 0; int j = n-1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }

        // second approach method
//        for(int i = 0; i < n/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n - 1 - i] = temp;
//
//        }

        print(arr);

    }

    public static void swap (int[] arr,int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static  void print(int[] arr) {
        for(int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
