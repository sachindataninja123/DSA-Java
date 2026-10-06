package Questions;

public class FirstUnsortedArr {
    static void main(String[] args) {
        int[] arr = {1,5,8,10,14,13,25}; // 13

        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i+1] <= arr[i]){
                System.out.println(arr[i+1]);
            }
        }
    }
}
