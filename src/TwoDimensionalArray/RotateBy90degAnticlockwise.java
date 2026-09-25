package TwoDimensionalArray;

public class RotateBy90degAnticlockwise {
    // rotate 90 degree array by AnticlockWise
    static void main(String[] args) {
        int[][] arr = {{0, 1, 2},{3, 4, 5},{6, 7, 8}};
        print(arr);

        // Output: [[2, 5, 8],
        //        [1, 4, 7],
        //        [0, 3, 6]]

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print(arr);

        for(int j = 0; j < arr[0].length; j++){
            int stcol =0;
            int endcol = arr.length - 1;

            while(stcol < endcol){
                int temp = arr[stcol][j];
                arr[stcol][j] = arr[endcol][j];
                arr[endcol][j] = temp;
                stcol++;
                endcol--;
            }
        }
        print(arr);
    }

    public static void print(int[][] arr){
        for(int a[] : arr){
            for(int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
