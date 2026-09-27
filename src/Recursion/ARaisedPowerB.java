package Recursion;

import java.util.Scanner;

public class ARaisedPowerB {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int a = sc.nextInt();
        System.out.println("Enter power: ");
        int b = sc.nextInt();

//        int ans = 1;
//        for(int i = 1; i<=b; i++){
//            ans *= a;
//        }
//        System.out.println(ans);


        System.out.println(a + " Power raise to " + b + " = " + pow(a,b));
    }

    public static int  pow(int a , int b){
        if(b == 0 ) return 1;

        return a * pow(a , b-1); // TC = 0(b) SC = 0(n)

    }
}
