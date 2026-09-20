package Strings;

import java.util.Arrays;

public class FreqCharacters {
    static void main(String[] args) {
        String s = "aaacccetttzzzz";
        int n = s.length();

        // BRUTE FORCE 0(n^2)
//        int maxFreq = -1;
//        int ans = s.charAt(0);
//
//        for(int i = 0; i<n; i++){
//            int freq = 1;
//            char ch = s.charAt(i);
//            for(int j = i; j<n; j++){
//                if(s.charAt(j) == ch) freq++;
//            }
//            if(freq > maxFreq){
//                maxFreq = freq;
//                ans = ch;
//            }
//            else if(freq == maxFreq && ch < ans ){
//                ans = ch;
//            }
//        }
//
//        System.out.println((char) ans);

        // SORTING SLIDING WINDOW 0(n logn)
//        int maxFreq = -1;
//        int ans = s.charAt(0);
//
//        char[] arr = s.toCharArray();
//
//        Arrays.sort(arr);
//        int i = 0; int j = 0;
//
//        while (j < n) {
//            while (j < n && arr[i] == arr[j]) {
//                j++;
//            }
//            int freq = j - i;
//            if (freq > maxFreq) {
//                maxFreq = freq;
//                ans = arr[i];
//            }
//            i = j;
//        }
//        int freq = j - i;
//        if(freq > maxFreq){
//            maxFreq = freq;
//            ans = arr[i];
//        }
//
//        System.out.println((char)ans);

        // FREQUENCY ARRAY 0(n) 0(1)
        int[] freq = new int[26];

        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch - 97;
            freq[idx]++;
        }

        int maxfreq = 0;
        char ans = s.charAt(0);
        for(int i = 0; i<26; i++){
            if(freq[i] > maxfreq){
                maxfreq = freq[i];
                ans = (char) (i + 97);
            }
        }
        System.out.println(ans);
    }

}
