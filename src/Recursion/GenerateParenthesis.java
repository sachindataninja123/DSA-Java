package Recursion;

public class GenerateParenthesis {
    static void main(String[] args) {
        int n = 4; // output = ["((()))","(()())","(())()","()(())","()()()"]

        generate(n, 0,0, "");

    }

    static void generate(int n, int l, int r,String s){
        if(r == n) {
            System.out.print(s+" ");
            return;
        }

        if(l < n) generate(n,l+1 ,r, s+"(");
        if(r < l) generate(n, l, r+1, s+")");
    }
}
