package Arrays;

import java.util.Collections;
import java.util.Vector;

public class addingOneQue {
    static void main(String[] args) {
        Vector<Integer>ans = new Vector<>();
        int[] arr = {9 , 9 , 9};
        print(arr);

        int n = arr.length;
        int carry = 1;
        for(int i = n-1; i>=0; i--){
            if(arr[i] + carry <= 9){ // arr[i] + carry = 9 or small from it
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }

        }
        if(carry == 1) ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }

    static void print(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
