package Questions;

import java.util.HashMap;

// maximum frequency elem in arr
public class ModeOfAnArr {
    static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5};

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        for(int i : freq.keySet()){
            System.out.println(i + " --> " + freq.get(i));
        }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for(int key : freq.keySet()){
            int currKey = key;
            int currKeyKiFreq = freq.get(key);
            if(currKeyKiFreq > maxFreq){
                maxFreq = currKeyKiFreq;
                maxFreqWaliKey = currKey;
            }
        }

        System.out.println(maxFreqWaliKey);
    }
}
