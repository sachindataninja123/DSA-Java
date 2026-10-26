package CyclicSort;

public class cyclicSort {
    static void main(String[] args) {
        int[] arr = {5,3,2,1,4,7,6};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        int i = 0;
        while(i < n) {
            if (arr[i] == i+1) i++;
            else {
                int idx = arr[i]-1;
                swap(arr , i, idx);
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void swap(int[] arr , int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
