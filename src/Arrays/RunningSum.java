package Arrays;

public class RunningSum {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; // 1,3,6,10,15

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            arr[i] = sum;
            System.out.print(arr[i]+ " ");
        }




    }
}
