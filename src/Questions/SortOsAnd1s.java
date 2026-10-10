package Questions;

import java.util.Arrays;

public class SortOsAnd1s {
    static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,1,0,1,0};
        printArr(arr);

//      0(n logn)
//        Arrays.sort(arr);
//        printArr(arr);
//
//        byLoop(arr); // 0(n)
//        printArr(arr);

        byTwoPointer(arr);
        printArr(arr);


    }

    //0(n)
    public static void byLoop(int[] arr) {
        int sum0s = 0;
        int sum1S = 1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0) sum0s++;
            else sum1S++;
        }

        for(int i = 0; i<sum0s; i++){
            arr[i] = 0;
        }
        for(int i = sum0s; i<arr.length; i++){
            arr[i] = 1;
        }
    }

    public static void byTwoPointer(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < j){
            if (arr[i]==0) i++;
            else if (arr[j]==1) j--;
            else if (arr[i] == 1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        };
        System.out.println();
    }
}
