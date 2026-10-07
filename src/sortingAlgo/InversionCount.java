package sortingAlgo;

public class InversionCount {
    static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int count = 0;

        // BRUTE FORCE
        for(int i = 0  ; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    System.out.print("(" +arr[i] + " " + arr[j] + ")");
                    count++;
                }

            }
        }

        System.out.println();
        System.out.println(count);
    }
}
