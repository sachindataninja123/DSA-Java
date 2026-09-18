package Strings;

public class compareToMethod {

    static void main(String[] args) {

        String s1 = "apple";
        String s2 = "apply";

        System.out.println(compareTo(s1, s2));
    }

    public static int compareTo(String s1, String s2) {

        int n = Math.min(s1.length(), s2.length());

        // Compare characters one by one
        for (int i = 0; i < n; i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 < c2) {
                return -1;
            }

            if (c1 > c2) {
                return 1;
            }
        }

        // All common characters are same
        if (s1.length() == s2.length()) {
            return 0;
        }
        else if (s1.length() > s2.length()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}