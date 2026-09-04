package Arrays;

public class rotateArrayByRight {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        int n = arr.length;
        k = k % n;

        print(arr);

        reverse(arr , 0, n-1-k); // numbers reverse
        reverse(arr , n-k, n-1); // k elem reverse
        reverse(arr , 0 , n-1); // after reversing reverse all elements

        print(arr);
    }

    public static void reverse(int[] arr, int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
