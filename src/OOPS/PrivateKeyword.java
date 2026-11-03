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

    int getRollNo(){ // getter
        return rollNo;
    }

    void setRollNo(int x){ // setter
        rollNo = x;
    }
}

public class PrivateKeyword {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.p();
        s1.cgpa = 8.8;
        s1.name = "Sachin";
        s1.p();
//        System.out.println(s1.cgpa + " " + s1.name);
        s1.setRollNo(45);
        System.out.println(s1.getRollNo());
    }
}
