package Strings;

public class ReverseSB {
    static void main(String[] args) {
//        String str = "Sachin";
//        StringBuilder s = new StringBuilder(str);

//        s.reverse();
//        int i = 0; int j = s.length() - 1;
//        while(i <= j){
//            char temp1 = s.charAt(i);
//            char temp2 = s.charAt(j);
//            s.setCharAt(i , temp2);
//            s.setCharAt(j , temp1);
//            i++;
//            j--;
//        }
//        s.deleteCharAt(1);   // both are costly process & time taking O(n)
//        s.insert(1 , 'a');  // both are costly process & time taking O(n)
//
//        s.delete(2 , 6); // 2  to 5
//        System.out.println(s);

        // make a string totally reverse not only print
        String str = "Aditya";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);


    }
}
