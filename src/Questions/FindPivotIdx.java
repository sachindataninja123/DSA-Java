package Questions;

public class FindPivotIdx {
    static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};

        System.out.println(pivotIdx(arr));
    }

    public static int pivotIdx(int[] arr){
        int n = arr.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        // first fill leftSum
        leftSum[0] = arr[0];
        for(int i = 1; i<n; i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        //  fill rightSum
        rightSum[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + arr[i];
        }

        for(int i = 0; i<n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }

        return -1;
    }
}
