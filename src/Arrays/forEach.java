package Arrays;

public class forEach {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};

        //only for show and traverse the elem of array
        for(int elem : arr){
            System.out.print(elem + " ");
        }

        for(int elem : arr){
            elem *= 2; // nothing happen
        }

        System.out.println();

        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}
