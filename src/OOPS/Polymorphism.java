package OOPS;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhou Bhou");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("pika pika");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Brrrrrr");
        }
    }
    static void main(String[] args) {
       Dog tommy = new Dog();
       Cat billi = new Cat();
       Pikachu bird = new Pikachu();
       Lion sher = new Lion();


       sher.speak();
       bird.speak();
       billi.speak();
       tommy.speak();
    }
}
