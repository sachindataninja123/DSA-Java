package Arrays;

import java.util.Scanner;

public class maximumElem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array Elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
          if(arr[i] > max){
              max = arr[i];
          }
        }

        System.out.println("Max elem of array is: "+ max);
    }
}

