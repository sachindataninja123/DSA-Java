package Methods;

public class returnType {
   public static int sum(int a) {
       System.out.println("Hello");
       System.out.println("Kaise ho");
       if(a > 0) return 5;
       else return 10;

    }
    static void main(String[] args) {
//        sum();
        int x = sum(3);
        System.out.println(3+x);
    }
}
