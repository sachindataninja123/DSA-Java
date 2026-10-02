package Recursion;

public class LinearSearchByRec {
    static void main(String[] args) {
        int[] arr = {12,34,56,43,23,56,78,98};
        int ele = 88;

        System.out.println(exists(arr, ele, 0));
    }

    public static boolean exists(int[] arr , int ele, int idx ) {
        if(arr.length == idx) return false;

        if(arr[idx] == ele){
            return true;
        }
        return  exists(arr , ele, idx + 1);
    }
}
