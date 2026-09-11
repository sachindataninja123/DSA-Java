package Searchin_Algo;

public class firstAndlastOccurence {
    static void main(String[] args) {
        int idx = -1;
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;

        int firstOccurence = firstOccurence(target , arr ,idx);
        int lastOccurence = lastOccurence(target , arr ,idx);

        System.out.println(firstOccurence + " " + lastOccurence);
    }

    public static int firstOccurence(int target , int[] arr, int idx){
        int low = 0 , high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] > target) high = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
            else {
                idx = mid;
                high = mid - 1;
            }
        }

        return  idx;
    }

    public static int lastOccurence(int target , int[] arr, int idx){
        int low = 0 , high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] > target) high = mid - 1;
            else if(arr[mid] < target) low = mid + 1;
            else {
                idx = mid;
                low = mid + 1;
            }
        }

        return  idx;
    }
}
