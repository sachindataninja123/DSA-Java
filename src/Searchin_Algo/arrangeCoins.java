package Searchin_Algo;

public class arrangeCoins {

    public static void main(String[] args) {
        int n = 13;

        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        long m = n;

        long x = sqrt(8 * m + 1);

        return (int) ((x - 1) / 2);
    }

    public static long sqrt(long n) {

        if (n == 0 || n == 1) {
            return n;
        }

        long low = 1;
        long high = n;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (mid == n / mid) {
                return mid;
            }
            else if (mid > n / mid) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return high;
    }
}