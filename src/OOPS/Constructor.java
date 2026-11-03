package OOPS;

public class Constructor {
   public static class Car{
        int seats;
        double length;
        String name;

//        Car(){  // DEFAULT CONSTRUCTOR
//
//        }
       Car(int x, double l, String n) {
           seats = x;
           length = l;
           name = n;
       }

       Car(double l, int x, String n) {
           seats = x;
           length = l;
           name = n;
       }

       void print() {
           System.out.println(seats + " " + length + " "+ name + " ");
       }
    }
    static void main(String[] args) {
//        Car c = new Car(); // DEFAULT CONSTRUCTOR
          Car c1 = new Car(4, 3.5, "Kia Sonet"); // PARAMETERIZED CONSTRUCTOR
          c1.print();

          Car c2 = new Car(7.5, 7, "Toyota Fortuner"); // PARAMETERIZED CONSTRUCTOR
          c2.print();

    }
}
