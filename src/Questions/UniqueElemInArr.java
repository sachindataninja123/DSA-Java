package Questions;

public class UniqueElemInArr {
    static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 5, 3, 2};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            boolean unique = true;

            for(int j = 0; j<n; j++){
                if(i != j && arr[i] == arr[j]){
                    unique = false;
                    break;
                }
            }

            if(unique){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
