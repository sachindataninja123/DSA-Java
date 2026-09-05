package Arrays;

public class addingOneLeetcode {
    static void main(String[] args) {
        int[] arr = {9};
        print(arr);
        int n = arr.length;
        int carry = 1;

        for(int i = n-1; i>=0; i--){
            if(arr[i] + carry <= 9){
                arr[i] =   arr[i] + carry;
                carry = 0;
            } else { // arr[i] + carry = 10
                arr[i] = 0;
                carry = 1;
            }
        }

        if(carry == 1){
            int[] newArr = new int[n + 1];

            newArr[0] = 1;

            for(int i = 0; i<n; i++){
                newArr[i + 1] = arr[i];
            }
            arr = newArr;
        }
        print(arr);
    }

    static void print(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
