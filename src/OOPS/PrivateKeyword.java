package OOPS;

class Student{
    String name;
    private int rollNo;
    double cgpa;
    private void print(){
        System.out.println(name + " "+ rollNo + " " + cgpa);
    }

    public void p(){
        print();
    }
}

public class PrivateKeyword {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.p();
        s1.cgpa = 8.8;
        s1.name = "Sachin";
        s1.p();
        System.out.println(s1.cgpa + " " + s1.name);

    }
}
