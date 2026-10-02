package Recursion;

public class UniquePaths {
    static void main(String[] args) {
        int m = 3 , n = 7;

        System.out.println(uniquePath(m , n));


    }
    public static int uniquePath(int m , int n){
        if(m == 1 || n == 1) return 1;

        return uniquePath(m,n-1) + uniquePath(m-1 , n);
    }
}
