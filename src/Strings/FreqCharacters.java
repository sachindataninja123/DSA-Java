package Strings;

import java.util.Arrays;

public class FreqCharacters {
    static void main(String[] args) {
        String s = "testsample";
        int n = s.length();

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
        int maxFreq = -1;
        int ans = s.charAt(0);

        char[] arr = s.toCharArray();

        Arrays.sort(arr);
        int i = 0; int j = 0;

        while (j < n) {
            while (j < n && arr[i] == arr[j]) {
                j++;
            }
            int freq = j - i;
            if (freq > maxFreq) {
                maxFreq = freq;
                ans = arr[i];
            }
            i = j;
        }
        int freq = j - i;
        if(freq > maxFreq){
            maxFreq = freq;
            ans = arr[i];
        }

        System.out.println((char)ans);

    }

}
