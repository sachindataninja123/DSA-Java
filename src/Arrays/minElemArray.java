package Arrays;

import java.util.Scanner;

public class minElemArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new  int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//        int min = arr[0];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Min elem is : "+ min);
    }
}
