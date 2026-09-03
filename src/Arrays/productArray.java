package Arrays;

import java.util.Scanner;

public class productArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array Elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int product = 1;
        for(int i = 0; i<arr.length; i++){
            product *= arr[i];
        }

        System.out.print("product of array :" + product);
    }
}
