package Pattern_printing;

import java.util.Scanner;

public class diamondPattern2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst ++;
            System.out.println();
        }


        nsp = 1;
        nst = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
