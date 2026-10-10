package Questions;

public class UniqueElem {
    static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1,4};
        int xorSum = 0;

        for(int ele : arr){
            xorSum = xorSum ^ ele;
        }

        System.out.println(xorSum);
    }
}
