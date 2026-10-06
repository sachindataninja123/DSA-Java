package Questions;

public class SwapElem {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; // output is =  2 1 4 3 6 5 7

        for(int i = 0; i < arr.length-1; i+=2){
             int temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }


    }
}
