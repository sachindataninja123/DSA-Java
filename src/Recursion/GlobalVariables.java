package Recursion;

public class GlobalVariables {
    static int x = 50;
    static void main(String[] args) {
        change(x);
        System.out.println(x);
        int x = 10;
        System.out.println(x);
    }
    public static void change(int x) {
        x = 30;
        System.out.println(x);
    }

}
