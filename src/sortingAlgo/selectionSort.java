package sortingAlgo;

import java.util.Scanner;

public class selectionSort {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] arr = {-1,3,10,2,4,5,19,12,11,-4,5};
//        int n = arr.length;


        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Given Array is: ");
        print(arr);

        for(int i = 0; i< n-1; i++) {
          int min = Integer.MAX_VALUE;
          int minIdx = -1;
          for (int j = i; j < n ; j++) {
             if (arr[j] < min) {
                 min = arr[j];
                 minIdx = j;
             }
         }

          int temp = arr[i];
          arr[i] = arr[minIdx];
          arr[minIdx] = temp;
     }

        System.out.println("After selection sort: ");
        print(arr);


    }

    public  static  void print (int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
