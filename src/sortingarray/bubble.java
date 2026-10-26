package sortingarray;

public class bubble {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main() {
        int arr[] = {0,-2,3,6,5,2,1};
        int n = arr.length;
        print(arr);

//        for(int j =0; j<= n-1; j++){
//            for(int i =0 ; i< n-1-j ; i++){
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }

        //Bubble shot optimised

//        for(int i =0; i<= n-1; i++){ // n-1 passes
//            boolean isSorted = true;
//            for(int j =0; j<n-1; j++){
//                if(arr[j]>arr[j+1]) {
//                    isSorted = false;
//                    break;
//                }
//            }
//            if(isSorted == true) break;
//            for(int j =0 ; j< n-1-i ; j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        for(int i =0; i<= n-1; i++){ // n-1 passes
            int swap = 0;
            for(int j =0 ; j< n-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        print(arr);

    }
}
