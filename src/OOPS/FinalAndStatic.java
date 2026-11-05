package OOPS;

class Cricketer{
//    final String country = "India";
    static String country = "NZ";
    int runs;
    double avg;
    String name;

    void print(){
        System.out.println(runs + " " + avg + " " + name + " ");
    }

    static void greet(){
        System.out.println("India only believe on Jassi Bhai!");
    }
}

public class FinalAndStatic {
    static void main(String[] args) {
        Cricketer.greet();
        System.out.println(Cricketer.country);

//        Cricketer c1 = new Cricketer();
////        c1.Country = "England";
//        System.out.println(c1.country);
//
//        c1.country = "India";
//
//        Cricketer c2 = new Cricketer();
//        System.out.println(c2.country);
//
//        c2.greet();
    }
}
