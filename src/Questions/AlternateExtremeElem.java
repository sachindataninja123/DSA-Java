package Questions;

public class AlternateExtremeElem {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; // 1 7 2 6 3 5 4

//        for(int i = 0; i < arr.length/2; i++){
//            System.out.print(arr[i] + " " + arr[arr.length - 1- i] + " ");
//        }
//
//        if(arr.length % 2 != 0){
//            System.out.println(arr[arr.length /2]);
//        }

        extremeElem(arr);


    }

    public static void extremeElem (int[] arr){
        int n = arr.length;
        int i = 0; int j = n-1;

        while (i <= j){
            if(i == j){
                System.out.print(arr[i] + " ");
                return;
            }
            else {
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
