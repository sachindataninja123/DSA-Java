package TwoDimensionalArray;

public class MaxIn2DArray {
    static void main(String[] args) {
        int[][] arr = {{1,2,23,5}, {9,7,8,5} , {3,4,5,6}};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
               if(arr[i][j] > max){
                   max = arr[i][j];
               }
            }
        }

        System.out.println(max);

    }
}
