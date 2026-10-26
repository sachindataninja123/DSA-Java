package Questions;

import java.util.Scanner;

public class table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(" 5 " + " * " + i + " = " + n * i);
        }
    }
}
