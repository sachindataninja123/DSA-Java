package OOPS;

class ComplexNumber {
    int x;
    int y;

    ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        if (y >= 0)
            System.out.println(x + " + " + y + "i");
        else
            System.out.println(x + " - " + (-y) + "i");
    }

    void add(ComplexNumber z) {
        x += z.x;
        y += z.y;
    }

    void substraction(ComplexNumber z) {
        x -= z.x;
        y -= z.y;
    }

    void multiply(ComplexNumber z) {
        int real = x * z.x - y * z.y;
        int imaginary = x * z.y + y * z.x;

        x = real;
        y = imaginary;
    }
}

public class ComplexNumQue {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(1, 1);
        ComplexNumber z2 = new ComplexNumber(1, 1);

        z1.print();
        z2.print();

//        System.out.println("ADDITION!!");
//        z1.add(z2); // ADDITION
//        z1.print(); z2.print();

//        System.out.println("SUBTRACTION!!");
//        z1.substraction(z2); // SUBTRACTION
//        z1.print(); z2.print();

        System.out.println("MULTIPLICATION!!");
        z2.multiply(z1);  // MULTIPLICATION
        z1.print(); z2.print();
    }
}