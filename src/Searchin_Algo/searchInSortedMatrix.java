package Searchin_Algo;

public class searchInSortedMatrix {
    static void main(String[] args) {
        int[][] arr = {{1,3,5,7} ,{10,11,16,20},{23,30,34,60}};
        int tar = 3;

        boolean result = searchInSortedMatrix(arr ,tar);

        System.out.println(result);
    }

    public static boolean searchInSortedMatrix(int[][] arr , int tar){
        int rows = arr.length , cols = arr[0].length;
        int low = 0;
        int high = rows * cols - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int midrow = mid / cols;
            int midcol = mid % cols;

            if(arr[midrow][midcol] == tar) return  true;
            else if(arr[midrow][midcol] > tar) high = mid - 1;
            else low = mid + 1;
        }
        return  false;
    }
}
