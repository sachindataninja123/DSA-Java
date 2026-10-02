package Recursion;

public class RecursionOnArr {
    static void main(String[] args) {
        int[] arr = {12,34,56,43,23,56,78,98};

        recPrint(arr,0);
    }

    public static void recPrint(int[] arr , int idx){
        if(arr.length == idx) return;

//        // print start from end
//        System.out.print(arr[idx] + " ");
//        recPrint(arr , idx + 1);

        // print end from start
        recPrint(arr , idx + 1);
        System.out.print(arr[idx] + " ");



    }
}
