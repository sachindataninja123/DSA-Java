package TwoDimensionalArray;

public class ReverseElemByRow {
    static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};

      for(int row = 0; row < arr.length; row++){
          int stcol = 0;
          int endcol = arr[0].length - 1;

          while(stcol < endcol) {
              int temp = arr[row][stcol];
              arr[row][stcol] = arr[row][endcol];
              arr[row][endcol] = temp;

              stcol++;
              endcol--;
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
