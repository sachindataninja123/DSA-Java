package Arrays;

import java.util.Arrays;

public class shallowCopyAndDeepCopy {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

//        //shallow copy of arr
//        int[] x = arr;
//        x[0] = 100;
//        System.out.println(arr[0]); // 100

        //deep copy
        int[] y = Arrays.copyOf(arr , arr.length);
        y[0] = 100;

        System.out.println(arr[0]);

    }
}
