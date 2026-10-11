package Questions;

import java.util.*;

public class ThreeSumArrayList {
    static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};

        Arrays.sort(arr);

        threeSum(arr);
    }

    public static List<List<Integer>> threeSum(int[] arr){
        Set<List<Integer>> ans = new HashSet<>();

        int n = arr.length;
        for(int i = 0; i<n-2; i++){
            int j = i + 1;
            int k = n-1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    Collections.sort(temp);

                    ans.add(temp);

                    j++;
                    k--;
                }

                else if (sum < 0){
                    j++;
                } else{
                    k--;
                }
            }
        }

        System.out.println(ans);

        return new ArrayList<>(ans);
    }
}
