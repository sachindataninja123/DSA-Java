package Recursion;

import java.util.ArrayList;

public class StringBasicsMore {
    static void main(String[] args) {
        String s = "Sachin";
        change(s);
        System.out.println(s);

        String[] arr = {"Sachin", "mohan","apple", "mango", "lithci"};
        for(String ele : arr){
            System.out.print(ele + " ");
        }

        System.out.println();

        ArrayList<String> al = new ArrayList<>();
        al.add("sachin");
        al.add("raghav");
        al.add("mohan");
        al.add("sohan");
        al.add("apple");

        change2(al);

        System.out.println(al);
    }

    public static void change2(ArrayList<String> al){
      al.add("Jitesh");
    }

    public static void change(String s){
        s = "Kumar";
    }
}
