package TwoDimensionalArray;

public class MaxSumInRow {
    static void main(String[] args) {
        int[][] arr = {{1,2,3,5}, {9,7,8,5} , {3,4,5,6}};

        int maxSum = 0;
        int row = -1;

        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = 0; j<arr[0].length; j++){
                sum += arr[i][j];
            }

           if(sum > maxSum){
               maxSum = sum;
               row = i;
           }
        }

        System.out.println("row no : "+row + " maxsum: "+ maxSum);
    }
}

