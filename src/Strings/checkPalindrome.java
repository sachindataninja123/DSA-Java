package Strings;

import java.util.Scanner;

public class checkPalindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(isPalindrome(str));


    }

    public static boolean isPalindrome(String str ) {
        int n = str.length();
        // first method
//        int i =0; int j = n -1;
//
//        while(i <= j){
//            if(str.charAt(i) != str.charAt(j)) return  false;
//            else{
//                i++;
//                j--;
//            }
//        }
//        return  true;


        // second method
        for(int i = 0; i< n /2 ; i++){
            if(str.charAt(i) != str.charAt(n-i-1)) return  false;
            else {
                return true;
            }
        }
        return  true;
    }
}
