package Searchin_Algo;

public class sqrt_root {
    static void main(String[] args) {
        int n = 15;

//        // brute force
//        int root = 1;
//        for(int i = 0; i<=n; i++){
//            if(i * i > n) break;
//            root = i;
//        }
//
//        System.out.print(root);

        // by binary search
        int low = 1;
        int high = n;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;

            if(mid * mid == n) {
                ans = mid;
                break;
            }
            else if(mid * mid > n) high = mid - 1;
            else { // (mid * mid < n)
              low = mid + 1;
            }

            ans = high;
        }

        System.out.println(ans);
    }
}
