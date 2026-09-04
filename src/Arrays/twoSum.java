package Arrays;

public class twoSum {
    static void main(String[] args) {
        int[] arr = {12, 23, 34, -9, -4, 98, 33};
        int target = 25;

        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j<arr.length; j++ ){
                if(arr[i] + arr[j] == target){
                    System.out.println("Two element are at index : "+ i + "," + j);
                }
                else {
                    System.out.println("Elements not found!");
                }

            }
            }
    }
}
