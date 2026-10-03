package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintSubsetsArr {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        List <List<Integer>> list = new ArrayList<>();
        List <Integer> ans = new ArrayList<>();
        subsets(ans, arr , 0 ,list);

        System.out.println(list.size());
        System.out.println(list);
    }

    public static void subsets(List<Integer> ans,  int[] arr , int idx, List<List<Integer>> list){
        if(idx == arr.length) {
            list.add(new ArrayList<>(ans));
            return;
        }
        int num = arr[idx];
        ans.add(num);
        subsets(ans , arr ,  idx + 1, list); //pick

        ans.remove(ans.size() - 1); // backtrack

        subsets(ans , arr , idx + 1, list); // skip
    }
}
