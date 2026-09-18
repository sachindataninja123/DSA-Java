package Strings;

public class InterningNewKeyword {

    // equals method
    public static boolean equals(String s1 , String s2 ){
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) return  false;
        }
        return true;

    }
    static void main(String[] args) {
        String s1 = new String("Sachin");
        String s2 = new String("Sachin");
//
//        System.out.println(s1 == s2); // false
//        System.out.println(s1.charAt(0) == s2.charAt(0)); // true
//        System.out.println(s1.equals(s2));
        System.out.println(equals(s1, s2));

//        String s1 = "Sachin";
//        String s2 ="Sachin";
//
//        System.out.println(s1 == s2); // true
//        System.out.println(s1.charAt(0) == s2.charAt(0)); // true


    }
}
