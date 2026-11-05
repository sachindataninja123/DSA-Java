package OOPS;
class Pokemon{
//    int hp;
//    int speed;
//    int attack;
//    int defense;
   private int power;
    String type;

//    void print(){
//        System.out.println(hp + " " + speed + " " + attack + " " + defense + " " + name + " " + type + " ");
//    }

    Pokemon(int power, String type){
        this.power = power;
        this.type = type;
    }

    int getPower(){
        return power;
    }

    void print(){ // GETTER
        System.out.println(this.power + " " + this.type + " ");
    }
}
public class RevisionOOPs {
    static void main(String[] args) {
//        Pokemon p1 = new Pokemon();
//        p1.hp = 20; p1.speed = 50; p1.attack = 100; p1.defense = 40; p1.name = "Pikachu"; p1.type = "Water";
//        p1.print();
//
//        Pokemon p3 = p1;  // p3 is shallow copy of p1 (can control p1 by p3)
//
//        p3.type = "Ground";
//        p3.print();

        Pokemon pikachu = new Pokemon(70 , "Electric");
        pikachu.type = "fire";
//        pikachu.power = 90; // ERROR BECAUSE PRIVATE ACCESS
        System.out.println(pikachu.getPower());
        Pokemon jigglyPuff = new Pokemon(80, "Ground");


        pikachu.print(); jigglyPuff.print();
    }
}
