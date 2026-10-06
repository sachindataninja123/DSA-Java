package Questions;

public class IntersectionAr {
    static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,2,9,4,10,12,15,5};  // common in both

        for(int i = 0; i < arr1.length; i++){
          for(int j = 0; j < arr2.length; j++){
              if(arr1[i] == arr2[j]) {
                  System.out.print(arr1[i] + " ");
                  break;
              }
          }
        }
    }
}
