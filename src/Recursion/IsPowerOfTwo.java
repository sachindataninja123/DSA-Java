package Recursion;

import java.util.Scanner;

public class IsPowerOfTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean ans = isPowerTwo(n);

        System.out.println(ans);
    }

    public static boolean isPowerTwo(int n) {
        if (n == 1) {
            return true;
        }

        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        return isPowerTwo(n / 2);
    }
}