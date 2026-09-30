package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // by loop
        // TC = 0(n)
        int n = sc.nextInt();
        int sum = n * (n + 1)/2;
        System.out.println(sum);

        System.out.println(sumNatNumber(n));
    }

    public static int sumNatNumber(int n){
        // by recursion
         // TC = 0(n)
        if(n == 0) return 0;
       return n + sumNatNumber(n - 1);
    }
}
