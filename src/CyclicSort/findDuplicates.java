package CyclicSort;

public class findDuplicates {
    static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        System.out.println(duplicate(arr));
    }

    public static int duplicate(int[] arr){
        int n = arr.length;

        int tSum = (n-1)*n/2;
        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += arr[i];
        }

        System.out.println(tSum);
        System.out.println(sum);

        return sum-tSum;
    }
}
