package TwoDimensionalArray;

public class ReverseElemByCol {
    static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};

        for(int col = arr[0].length - 1; col >= 0; col--){

            int i = 0;
            int j = arr.length-1;

            while (i < j){
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;

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
