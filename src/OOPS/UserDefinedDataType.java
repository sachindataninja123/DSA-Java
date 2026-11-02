package OOPS;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Student {
        String name;
        int rollno;
        double cgpa;

        void print() {
            System.out.println(name+" "+rollno+" "+cgpa);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = "Sachin";
        s1.rollno = 2408;
        s1.cgpa = 8.2;

        Student s2 = new Student();
        s2.name = "Akash";
        s2.rollno = 333;
        s2.cgpa = 9.3;

        Student s3 = new Student();
        s3.name = "Mahi";
        s3.rollno = sc.nextInt();
        s3.cgpa = 8.8;


        System.out.println(s1.cgpa + " " + s1.rollno + " "+ s1.name);
        s2.cgpa = 7.7;
        System.out.println(s2.cgpa);

       s1.print();
       s2.print();
       s3.print();
    }


}
