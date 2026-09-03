package Arrays;

import java.util.Arrays;

public class sortArrayBuiltIn {
    static void main(String[] args) {
        int[] arr = {23,-1,2,45,-5,-3,12};
        System.out.println("Array without sorting...");
        print(arr);

        System.out.println("Array after sorting !!");
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
