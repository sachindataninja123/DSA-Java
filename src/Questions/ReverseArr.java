package Questions;

public class ReverseArr {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printArr(arr);
        int n = arr.length;
        int i = 0;
        int j = n-1;

        reverse(arr, i, j);

        printArr(arr);
        reverseByRec(arr, i, j);
        printArr(arr);
    }

    public static void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverseByRec(int[] arr, int i, int j) {
        if (i < j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverseByRec(arr, i+1, j-1);
    }


    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}
