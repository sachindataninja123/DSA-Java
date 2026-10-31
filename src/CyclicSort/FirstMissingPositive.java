package CyclicSort;

public class FirstMissingPositive {
    static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};

        System.out.println(missingPositive(arr));
    }

    public static int missingPositive(int[] arr){
        int n = arr.length;

        int i = 0;
        while (i < n){
            if(arr[i] <= 0) i++;
            else if(arr[i] > n) i++;
            else if(arr[i] == i + 1) i++;
            else if(arr[i] == arr[arr[i]-1]) i++;
            else swap(arr, i, arr[i]-1);
        }

        for(i = 0; i<n; i++){
            if(arr[i] != i+1) return i+1;
        }
        return i+1;
    }

    public static void swap(int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
