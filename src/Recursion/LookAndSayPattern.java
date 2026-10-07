package Recursion;

public class LookAndSayPattern {
    static void main(String[] args) {
        int n = 6;  // for 5 = 111221 then for 6 = 312211
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n){
        if(n == 1) return "1";

        String s = countAndSay(n-1); // if we have to hide the extra freq count and adding last then we call the
        // recursion with + "#";

        String ans = "";

        int i = 0; int j = 0;
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                j++;
            } else {
                int freq = j-i;
                ans += freq;
                ans += s.charAt(i);
                i = j;
            }
        }
        // then we hide it
        int freq = j-i;
        ans += freq;
        ans += s.charAt(i);
        i = j;

        return ans;
    }
}
