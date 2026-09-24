package TwoDimensionalArray;

public class MinElemOutofMax {
    static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7}, {7,2,1,6,3} , {5,5,4,1,4} , {3,1,8,2,6}};

        int minofRows = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
            if(max < minofRows){
                minofRows = max;
            }
        }
        System.out.println(minofRows);
    }
}
