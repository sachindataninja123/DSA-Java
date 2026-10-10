package Questions;

public class MissingNum {
    static void main(String[] args) {
        int[] arr = {1,2,3,0,5,6};
        int n = arr.length;

//        int sum = 0;
//
//        int totalSum = n *(n+1)/2;
//
//        for(int i = 0; i<n; i++){
//            sum += arr[i];
//        }
//
//        int missingNum = totalSum - sum;
//
//        System.out.println(missingNum);

        int xorSum = 0;

        for(int ele : arr){
            xorSum = xorSum ^ ele;
        }

        for(int i = 0; i<=n; i++){
            xorSum = xorSum ^ i;
        }

        System.out.println(xorSum);
    }
}
