package Methods;

public class arguments {
    static void main(String[] args) {
        max(25,22,20);
    }

    public static void max (int a , int b, int c){
      if(a >= b && a>=c) System.out.println(a);
      else if(b >=c && b >= a) System.out.println(b);
      else System.out.println(c);
    }
}
