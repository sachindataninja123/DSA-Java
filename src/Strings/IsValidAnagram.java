package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class IsValidAnagram {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1 , s2));
    }

    public static boolean isAnagram(String s1 , String s2){
        if(s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i< arr1.length ; i++){
            if(arr1[i] != arr2[i]) return  false;
        }

        return true;
    }
}
