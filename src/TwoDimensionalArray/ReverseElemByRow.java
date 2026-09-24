package TwoDimensionalArray;

public class ReverseElemByRow {
    static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};

      for(int row = 0; row < arr.length; row++){
          int i = 0;
          int j = arr[0].length - 1;

          while(i < j) {
              int temp = arr[row][i];
              arr[row][i] = arr[row][j];
              arr[row][j] = temp;

              i++;
              j--;
          }
      }

        for(int []a : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

}
