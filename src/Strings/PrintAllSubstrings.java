package Strings;

public class PrintAllSubstrings {
    static void main(String[] args) {
        String s = "sachin";

        int n = s.length();

        for(int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(s.substring(i, j + 1) + " ");
                String str = s.substring(i, j + 1);
            }
            System.out.println();
        }

    }

}
