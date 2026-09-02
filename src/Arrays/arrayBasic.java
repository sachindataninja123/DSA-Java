package Arrays;

public class arrayBasic {
    static void main(String[] args) {
        // initialization
        int[] arr = {12,23,45,67,89,12,45};
        int[] arr1 = new int[5];
        arr1[0] = 34;
        arr1[1] = 34;
        arr1[2] = 34;
        arr1[3] = 34;
        arr1[4] = 34;

        System.out.println(arr[0]);

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
