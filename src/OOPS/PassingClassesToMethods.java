package OOPS;

public class PassingClassesToMethods {
    public static class car{
        int seats;
        String name;
        int torque;
        String type;
        double length;
    }
    static void main(String[] args) {
        car c = new car();
        c.length = 2.99;
        c.name = "Kia sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";
    }
}
