package OOPS;

public class PassingClassesToMethods {
    public static class car{
        int seats;
        String name;
        int torque;
        String type;
        double length;
        void print() {
            System.out.println(seats+" "+name+" "+torque+" "+type+" "+length+" ");
        }
    }
    static void main(String[] args) {
        car c = new car();
        c.length = 3.99;
        c.name = "Kia sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        change(c);

        System.out.println(c.seats);
        c.print();
    }

    public static void change(car c){
        c.seats = 4;
    }
}
