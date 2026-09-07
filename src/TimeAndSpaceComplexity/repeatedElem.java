package TimeAndSpaceComplexity;

public class repeatedElem {

    static void main() {
        int[] arr = {1,2,3,4,5,4};

        int n = arr.length;

        // approach 1
//        for(int i = 0; i<n; i++){
//            for(int j = i+1; j<n; j++){
//                if(arr[i] == arr[j]){
//                    System.out.println("Repeated elem is : " + arr[i] + " at index: "+ i );
//                    break;
//                }
//            }
//        }

        // approach 2
        boolean found = false;
        boolean[] flag = new boolean[n + 1];

        for(int i = 0; i<n; i++){
            int ele = arr[i];

            if(flag[ele] == true) found = flag[ele];
            else  flag[ele] = true;

        }

        
    }
}

