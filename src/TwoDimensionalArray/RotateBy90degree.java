package TwoDimensionalArray;

public class RotateBy90degree {
    static void main(String[] args) {
        // rotate 90 degree array by clockWise
        int[][] arr = {{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        print(arr);

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print(arr);

       for(int i = 0; i < arr.length; i++){
           int stcol = 0; int endcol = arr[0].length - 1;

           while(stcol < endcol){
               int temp = arr[i][stcol];
               arr[i][stcol] = arr[i][endcol];
               arr[i][endcol] = temp;
               stcol++;
               endcol--;
           }
       }


        print(arr);
    }
    static void print(int[][] arr) {
        for (int a[] : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
