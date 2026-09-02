package Arrays;

import java.util.Scanner;

public class negativeArrayElem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array Elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< arr.length; i++){
           if(arr[i] < 0){
               System.out.print(arr[i] + " ");
           }
        }
    }
}
