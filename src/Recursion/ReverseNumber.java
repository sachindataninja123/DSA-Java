package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int n , int r){
        if(n == 0) return r;

        return  reverse(n / 10, r * 10 + n % 10);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = 0;

//        while (n != 0){
//            rev = rev * 10;
//            rev += (n % 10);
//            n /= 10;
//        }

        System.out.println(reverse(n , r));
    }
}
