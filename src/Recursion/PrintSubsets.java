package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class PrintSubsets {
    static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subsets("", s , 0 ,list);

        System.out.println(list.size());
        Collections.sort(list);

        System.out.println(list);
    }

    public static void subsets(String ans , String s , int idx, List<String> list){
        if(idx == s.length()) {
           if(!ans.isEmpty()) list.add(ans);
           return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch , s ,  idx + 1, list); //pick
       subsets(ans , s , idx + 1, list); // skip
    }
}
