package Arrays;

public class digitsInNumber {
    static void main(String[] args) {
        int n = 795678;
        int count  = 0;

        while(n != 0){
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}
