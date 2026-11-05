package OOPS;

import java.util.Arrays;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;

        StudentData(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }

        StudentData(int s){
            marks = new int[s];
        }
    }
    static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        StudentData s1 = new StudentData(arr);
        s1.marks[0] = 40;
        System.out.println(arr[0]);
        StudentData s2 = new StudentData(4);

    }
}
