package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListBasic {
    static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(13);
        arr.add(25);
        arr.add(23);
        arr.add(13);

//        System.out.println(arr.get(2)); // arr[2]
        arr.set(3, 50); // arr[3] = 50

        // for printing arrayList
        // 1st
//        System.out.println(arr); // [20, 13, 25, 50, 13]
//
//        // 2st
//        int n = arr.size();
//        for(int i =0; i<n; i++){
//            System.out.print(arr.get(i) + " ");
//        }
//        System.out.println();
//
//        // 3rd
//        for(int elem : arr){
//            System.out.print(elem + " ");
//        }

        arr.add(99);
        arr.add(1,100);
        arr.remove(arr.size() - 1);

        System.out.println(arr);

        int i = 0; int j = arr.size()-1;
        while (i < j){
            int temp = arr.get(i);
            arr.set(i , arr.get(j));
            arr.set(j , temp);
            i++;
            j--;
        }

//        Collections.reverse(arr);

        System.out.println(arr);
    }
}
