package Arrays;

public class rotateArrayByLeft {
    static void main(String[] args) {
        int[]  arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        int n = arr.length;
        d = d % n;

        print(arr);

        reverse(arr , 0 , d-1);
        reverse(arr , d, n-1);
        reverse(arr , 0 , n-1);

        print(arr);
    }

    public static void reverse(int arr[] , int i , int j){
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
