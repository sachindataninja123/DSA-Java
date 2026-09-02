package Methods;

import java.util.Scanner;

public class maxOfThreeBuiltIn {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // three numbers max
//        int maxofAB = Math.max(a, b);
//        int maxofABC = Math.max(maxofAB , c);
//
//        System.out.println(maxofABC);
//        System.out.println(Math.max(Math.max(a,b),c));

        // four numbers max
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }




}
