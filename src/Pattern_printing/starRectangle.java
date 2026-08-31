package Pattern_printing;

import java.util.Scanner;

public class starRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        for(int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
