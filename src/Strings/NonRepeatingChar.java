package Strings;

import java.util.Arrays;

public class NonRepeatingChar {
    static void main(String[] args) {
        String s = "loveleetcode";

        int n = s.length();
//        char ans = s.charAt(0);

//        for(int i = 0; i< n; i++){
//            int freq = 0;
//            char ch = s.charAt(i);
//            for(int j = 0; j<n; j++){
//                if(s.charAt(j) == ch) freq++;
//            }
//            if(freq == 1){
//                ans = ch;
//                break;
//            }
//        }

//        System.out.println(ans);

        int[] freq = new int[26];

        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch - 97;
            freq[idx]++;
        }

        int maxfreq = -1;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                maxfreq = i;
                System.out.println(ch);
                break;
            }
        }
        System.out.println(maxfreq);

    }
    }

