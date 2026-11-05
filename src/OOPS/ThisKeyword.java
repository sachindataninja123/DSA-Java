package OOPS;

public class ThisKeyword {
    public static class Car{
        int price;
        String name;

        Car(int price, String name){
            this.price = price;
            this.name = name;
        }

        Car(String s, int p){
            price = p;
            name = s;
        }

        void print(){
            System.out.println(price + " "+ name+ " ");
        }
    }
    static void main(String[] args) {
        Car c1 =  new Car(1250000,"Kia Sonet");
        c1.print();
        Car c2 =  new Car("Kia Sonet", 1250000);
        c2.print();
    }
}
