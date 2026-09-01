package Pattern_printing;

import java.util.Scanner;

public class triangleFlippedVertically {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Method = 1

//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                if((i + j) > n) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

        // Method = 2
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){ // spaces
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
               System.out.print("* "); // stars
           }
            System.out.println();
        }

    }
}
