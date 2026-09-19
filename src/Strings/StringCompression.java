package Strings;

public class StringCompression {
    static void main(String[] args) {
        String s = "aaABBb";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        int n = s.length();
        int i = 0;


        while(i < n){
            char ch = s.charAt(i);
            int j = i;
            while(j < n && s.charAt(j) == ch){
                j++;
            }

            int count = j-i;

            sb.append(ch);
            sb.append(count);

            i = j;
        }

        System.out.println(sb);
    }
}
