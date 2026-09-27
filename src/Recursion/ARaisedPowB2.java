package Recursion;

import java.util.Scanner;

// 2nd optimized method
public class ARaisedPowB2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int a = sc.nextInt();
        System.out.println("Enter power: ");
        int b = sc.nextInt();

        System.out.println(a + " Power raise to " + b + " = " + pow(a,b));
    }

    // OPTIMIZED TIME COMPLEXITY = 0( log n )
     public static int pow(int a , int b){
        if(b == 0) return 1;

        int call = pow(a , b/2);

        if(b % 2 == 0){
            return call * call;
        }else
            return a * call * call;
    }
}
