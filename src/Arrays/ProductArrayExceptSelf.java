package Arrays;

public class ProductArrayExceptSelf {
    static void main(String[] args) {
        int[] arr = {1,2,3,4}; // 24,12,8,6

        int[] res = multiplyArrayExceptItself(arr);

        for(int ele : res){
            System.out.print(ele + " ");
        }
    }
    public static int[] multiplyArrayExceptItself(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int prefix = 1;
        int suffix = 1;

        for(int i = 0; i < n; i++){
            ans[i] = prefix;
            prefix = prefix * arr[i];
        }

        for(int i = n-1; i>= 0; i--){
            ans[i] *= suffix;
            suffix *= arr[i];
        }

        return ans;
    }

}
