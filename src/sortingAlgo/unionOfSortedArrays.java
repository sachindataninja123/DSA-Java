package sortingAlgo;

import java.util.ArrayList;

public class unionOfSortedArrays {
    static void main(String[] args) {
        int[] a = {2, 2, 3, 4, 5};
        int[] b = {1, 1, 2, 3, 4};

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            int value;

            if (a[i] < b[j]) {
                value = a[i++];
            }
            else if (a[i] > b[j]) {
                value = b[j++];
            }
            else {
                value = a[i];
                i++;
                j++;
            }

            if (ans.isEmpty() || ans.get(ans.size() - 1) != value) {
                ans.add(value);
            }
        }

        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}