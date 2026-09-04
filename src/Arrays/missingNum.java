package Arrays;

public class missingNum {
    static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int n = arr.length + 1;

        int totalSum = n*(n+1)/2;

        int arrSum = 0;
        for(int i = 0; i<n - 1; i++){
            arrSum += arr[i];
        }

        System.out.println("Total sum: "+ totalSum);
        System.out.println("Array sum: "+ arrSum);

        int missingNum = totalSum - arrSum;
        System.out.println("Missing Number is : "+ missingNum);

    }
}
