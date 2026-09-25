package TwoDimensionalArray;

import java.util.ArrayList;

public class SpiralMatrix {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6} , {7,8,9,10,11,12} ,
                {13,14,15,16,17,18} , {19,20,21,22,23,24}, {25,26,27,28,29,30}};

        printArr(arr);

        System.out.println(spirallyTraverse(arr));


    }

    public static ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length; int n = arr[0].length;

        int firstRow = 0, lastRow = m-1;
        int firstCol = 0, lastCol = n-1;

        // first method on while condition
//        while(firstCol <= lastCol && firstRow <= lastRow){
//            // right
//            for(int j = firstCol; j<=lastCol; j++){
//                ans.add(arr[firstRow][j]);
//            }
//            firstRow++;
//            if(firstRow > lastRow || firstCol > lastCol) break;
//
//            // down
//            for(int i = firstRow; i<=lastRow; i++){
//                ans.add(arr[i][lastCol]);
//            }
//            lastCol--;
//            if(firstRow > lastRow || firstCol > lastCol) break;
//
//            // left
//            for(int j = lastCol; j >= firstCol; j--){
//                ans.add(arr[lastRow][j]);
//            }
//            lastRow--;
//            if(firstRow > lastRow || firstCol > lastCol) break;
//
//            // up
//            for(int i = lastRow; i >= firstRow; i--){
//                ans.add(arr[i][firstCol]);
//            }
//            firstCol++;
//        }

        // second method on while condition
        int maxOfElements = m * n;
        while(ans.size() < maxOfElements){
            // right
            for(int j = firstCol; j<=lastCol; j++){
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
            if(ans.size() == maxOfElements) break;

            // down
            for(int i = firstRow; i<=lastRow; i++){
                ans.add(arr[i][lastCol]);
            }
            lastCol--;
            if(ans.size() == maxOfElements) break;

            // left
            for(int j = lastCol; j >= firstCol; j--){
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if(ans.size() == maxOfElements) break;

            // up
            for(int i = lastRow; i >= firstRow; i--){
                ans.add(arr[i][firstCol]);
            }
            firstCol++;
        }

         return ans;
    }

    public static void printArr (int[][] arr){
        for(int a[] : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
