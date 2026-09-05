package Arrays;

public class sort0s1s2s {
    static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        int sum0s = 0;
        int sum1s = 0;
        int sum2s = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                sum0s++;
            }else if(arr[i] == 1){
                sum1s++;
            } else {
                sum2s++;
            }
        }

        System.out.println(sum0s +" " + sum1s + " "+sum2s);

        for(int i =0; i< sum0s; i++){
            arr[i] = 0;
        }

        for(int i = sum0s; i < arr.length - sum2s; i++){
            arr[i] = 1;
        }

        for(int i = sum0s + sum1s; i< arr.length; i++){
            arr[i] = 2;
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

