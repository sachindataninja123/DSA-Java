package Questions;

import java.util.ArrayList;

public class UnionOfArr {
    static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {4,3,2,7,8,9};

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i< a.length; i++){
           if(!ans.contains(a[i])){
               ans.add(a[i]);
           }
        }

        for(int i = 0; i< b.length; i++){
            if(!ans.contains(b[i])){
                ans.add(b[i]);
            }
        }

        System.out.println(ans);
    }
}
