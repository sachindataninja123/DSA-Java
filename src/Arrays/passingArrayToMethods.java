package Arrays;

public class passingArrayToMethods {
    static void main(String[] args) {
        int[] x  = {20,30,23,99};
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);
    }

    static void change(int[] x) {
        x[3]  = 53;
    }
}
