package Questions;

public class ThreeSum {
    static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int target =13;

        System.out.println(byNestedLoops(arr, target));
        System.out.println(byTwoPointer(arr, target));

    }

    public static boolean byNestedLoops(int[] arr, int target){
        int n = arr.length;
        for(int i = 0; i<n-2; i++){
            for(int j = 0; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean byTwoPointer(int[] arr, int target){
        int n = arr.length;
        for(int i = 0; i<n-2; i++){
            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(sum == target) return true;
                else if(sum < target) j++;
                else k--;
            }
        }

        return false;
    }

}
