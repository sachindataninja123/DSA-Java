package Methods;

public class passByValueAndRefrence {
    public static void change(int x){
        x = 10;
        System.out.println(x);
    }
    static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}

