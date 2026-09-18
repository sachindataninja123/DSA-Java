package Strings;

public class StringToCharArray {
    static void main(String[] args) {
        String str = "Sachin";

        char[] arr = str.toCharArray();

        for(char ele : arr){
            System.out.print(ele + " ");
        }
    }
}
