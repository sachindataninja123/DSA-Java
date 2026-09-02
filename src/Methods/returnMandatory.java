package Methods;

public class returnMandatory {
    static void main(String[] args) {
        System.out.println(ret(3));
    }

    public static  int ret (int a) {
        if(a < 5) {
            return a;
        }
        return -1;
    }
}
