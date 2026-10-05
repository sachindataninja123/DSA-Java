package Recursion;

public class PreInPost {
    static void main(String[] args) {
        pip(3);
    }

    public static void pip(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        pip(n-1);
        System.out.print(n + " ");
        pip(n-1);
        System.out.print(n + " ");
    }
}
