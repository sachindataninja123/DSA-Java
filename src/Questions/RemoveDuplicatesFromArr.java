package Questions;

public class RemoveDuplicatesFromArr {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,1,3,7,8,9};

        int i = 0;
        int j = 1;
        int n = arr.length;

        while(j < n){
            if(arr[i] == arr[j]) {
                j++;
            }
            else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }

        System.out.println(i+1);
    }
}
