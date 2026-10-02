package Recursion;

public class WaysToReachNthStair2 { // max jumps 3
    static void main(String[] args) {
        int n = 4;

        System.out.println(reachNthStair(n));
    }

    public static int reachNthStair(int n){
        if (n == 0 ) return 1;
        if(n < 0) return 0;

        return reachNthStair(n-1) + reachNthStair(n-2) + reachNthStair(n-3);
    }
}
