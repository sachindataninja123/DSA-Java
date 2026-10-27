package CyclicSort;

public class MissingNum {
    static void main(String[] args) {
        int[] arr = {8, 2, 4, 6, 3, 7, 1};

        int n = 1 + arr.length;

        int i = 0;
        while(i < arr.length){
            if(arr[i] == i + 1 ||  arr[i] == n) i++;
            else {
                int idx = arr[i] - 1;
                swap(arr, i, idx);
            }
        }

//        for(int ele :  arr){
//            System.out.print(ele + " ");
//        }

        for(i = 0; i < arr.length; i++){
            if (arr[i] != i + 1) {
                System.out.println(i+1);
            }
        }


    }
    public static void swap(int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
