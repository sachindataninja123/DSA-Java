package Questions;

public class Segregrate0s1s2s {
    static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        printArr(arr);
        segregate(arr);
        printArr(arr);


    }

    public static void segregate(int[] arr){
        int sum0s = 0;
        int sum1s = 0;
        int sum2s = 0;

        int n = arr.length;

        for(int i = 0; i<n; i++){
            if(arr[i] == 0) sum0s++;
            else if(arr[i] == 1) sum1s++;
            else sum2s++;
        }

        for(int i = 0; i < sum0s; i++){
            arr[i] = 0;
        }

        for(int i = sum0s; i < n-sum2s; i++){
            arr[i] = 1;
        }

        for(int i = sum0s+sum1s; i<n; i++){
            arr[i] = 2;
        }
    }

    public static void printArr(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        };
        System.out.println();
    }

}
