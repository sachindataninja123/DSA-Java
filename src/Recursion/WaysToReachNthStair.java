package Recursion;

public class WaysToReachNthStair {
    // ways to reach nth stair (max jumps 2)
    static void main(String[] args) {
        int n = 5;

        System.out.println(waysToReach(n));

    }
    public static int waysToReach(int n){
        if( n <= 2) return n;

        return waysToReach(n-1) + waysToReach(n-2);
    }
}
