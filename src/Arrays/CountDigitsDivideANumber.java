package Arrays;

public class CountDigitsDivideANumber {
    static void main(String[] args) {
//        int n = 121; // output = 2
        int n = 1248; // output = 4
        int originalNum = n;

        int count = 0;

        while(n != 0){
            int lastDigit = n % 10;
            if(originalNum % lastDigit == 0) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}
