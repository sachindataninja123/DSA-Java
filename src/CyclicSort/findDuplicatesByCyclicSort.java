package CyclicSort;

public class findDuplicatesByCyclicSort {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,1};

        System.out.println(duplicates(arr));
    }

    public static int duplicates(int[] arr){
        int n = arr.length;

        int i = 0;
        while (i < n){
            if(arr[i] == i+1) i++;
            else if (arr[i] == arr[arr[i] - 1]) {
                return arr[i];
            }
            else {
               int idx = arr[i] - 1;
               swap(arr, i, idx);
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
