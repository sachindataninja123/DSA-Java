package Questions;

public class FirstRepeatingElem {
    static void main(String[] args) {
        int[] arr = {2,4,6,8,7,6,8};
        int n = arr.length;

        for(int i = 0 ; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }
}
