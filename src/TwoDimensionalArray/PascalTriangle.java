package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static void main(String[] args) {
        int n = 5;

        System.out.println(pascalTrian(n));
    }

    public static List<List<Integer>> pascalTrian(int n){
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            ans.add(new ArrayList<Integer>());
            for(int  j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    ans.get(i).add(1); // arr[i][j] = 1;
                }
                else {
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
        }

        return ans;

    }
}
