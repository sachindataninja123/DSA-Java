package Arrays;

import java.util.Scanner;

public class arraySum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array Elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.print("Sum of array elements are: "+ sum);

    }
}
