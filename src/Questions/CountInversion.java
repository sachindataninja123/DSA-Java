package Questions;

public class CountInversion {
    static void main(String[] args) {
        int[] arr = {2,4,1,3,5};

        int n = arr.length;
        int count = 0;

//        T C = 0(n^2)
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    System.out.println(arr[i] + " " + arr[j]);
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
