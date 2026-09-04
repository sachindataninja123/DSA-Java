package Arrays;

public class secondMaxInArray {
    static void main(String[] args) {

        int[] arr = {10, 12, 8, 50, 70, 99,99, 88};

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max elem is : "+ max);

        int smax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
                if(arr[i] > smax && arr[i] != max){
                    smax = arr[i];
                }
        }
        System.out.println("SecMax elem is : "+ smax);

    }
}
