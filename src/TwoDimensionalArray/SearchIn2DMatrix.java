package TwoDimensionalArray;

public class SearchIn2DMatrix {
    static void main(String[] args) {
        int[][] arr = {{1, 5, 9, 11} , {14, 20, 21, 26}, {30, 34, 43, 50}};
        int tar = 43;
        boolean found = false;


        // BETTER APPROACH 0(m + n)
        int m = arr.length; int n = arr[0].length;
        int i = 0; int j = n-1;

        while(i < m && j >= 0){
            if(arr[i][j] > tar) j--;
            else if(arr[i][j] < tar) i++;
            else {
                found= true;
                break;
            }
        }


//        // BRUTE FORCE 0(mn)
//        for(int i = 0 ; i <arr.length; i++){
//            for(int j = 0; j < arr[0].length; j++){
//                if(arr[i][j] == tar){
//                    found = true;
//                }
//            }
//
//        }
//
        System.out.println(found ? "Target Exists!!" : "Target does'nt Exists!!");
    }
}
