package Questions;

public class DuplicateElemInArr {
    static void main(String[] args) {
        int[] arr = {5,1,1,3,5,2};
        int n = arr.length;
        int duplicate = -1;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                  duplicate = i;
                  break;
                }
            }
        }

        if (duplicate != -1) {
            System.out.println(arr[duplicate]);
        }
    }
}
