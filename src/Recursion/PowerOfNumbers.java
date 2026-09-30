package Recursion;

import java.util.Scanner;

// Raise to Power of Its Own Reverse
public class PowerOfNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalN = n;
        int rev = 0;

        while (n != 0){
             rev = rev * 10;
             rev += n % 10;
             n /= 10;
        }

        System.out.println(originalN + " " + rev);
        System.out.println(pow(originalN, rev));
    }

    public static int pow(int a , int b){
        if(b == 0) return 1;
        int call = pow(a , b/2);

        if(b % 2 == 0){
            return call * call;
        } else {
            return call * call * a;
        }
    }
}
