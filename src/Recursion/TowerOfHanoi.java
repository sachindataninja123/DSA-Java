package Recursion;

public class TowerOfHanoi {
    static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }

    // RULE TO MOVE DISC FROM A TO C
    // 1. Move (n-1) disc from source to helper via destination
    // 2. Move larger disc from source to destination
    // 3. Move (n-1) disc from helper to dest via source

    public static void hanoi(int n, char source, char helper, char dest){
        if(n == 0) return;

        // move (n-1) disc from source to helper via destination
        hanoi(n-1, source, dest, helper);

        // print source to destination
        System.out.println(source + " --> " + dest);

        // move (n-1) disc from helper to dest via source
        hanoi(n-1, helper, source, dest);

    }
}
