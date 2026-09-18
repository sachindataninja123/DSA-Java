package Strings;

public class changeString {
    static void main(String[] args) {
        String s = "aBCDER";

        char first = s.charAt(0);

        if(Character.isUpperCase(first)){
           s =  s.toUpperCase();
        }else {
          s =   s.toLowerCase();
        }

        System.out.println(s);
    }
}
