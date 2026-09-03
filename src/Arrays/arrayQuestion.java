package Arrays;

import java.util.Scanner;

public class arrayQuestion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        print(arr);

        for(int i = 0; i<arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + 10 + " ");
            } else {
                System.out.print(arr[i] * 2 + " ");
            }
        }

    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
