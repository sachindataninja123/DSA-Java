package Arrays;

public class segregate0sAnd1s {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};

        int n = arr.length;
        print(arr);

       // first method basic (Two pass solution)
//        int noZero = 0;
//        int noOne = 0;
//
//        for(int i = 0; i< n; i++) {
//            if (arr[i] == 0) noZero++;
//            else noOne++;
//        }
//
//        for(int i =0; i<noZero; i++){
//            arr[i] = 0;
//        }
//        for(int i =noZero; i<n; i++){
//            arr[i] = 1;
//        }
//
//        print(arr);

        // 2nd method (Two pointer approach)
        int i = 0; int j = n-1;
        while(i < j){

          if(arr[i] == 0) i++;
          else if(arr[j] == 1) j--;
          else if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
        print(arr);

    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

