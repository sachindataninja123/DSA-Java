package TwoDimensionalArray;

import java.util.Scanner;

public class OutputIn2DArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
//          int[][] arr = {{1,2,3,5}, {9,7,8,5} , {3,4,5,6}};

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("size is :" + arr.length + " " + arr[0].length);

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
