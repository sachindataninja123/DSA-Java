package Questions;

import java.util.ArrayList;

public class AllDuplicatesInArr {
    static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = new ArrayList<>();

        // BRUTE FORCE
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    ans.add(arr[i]);
                    break;
                }
            }
        }

        System.out.println(ans);

    }
}
