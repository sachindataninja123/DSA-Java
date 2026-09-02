package Methods;

public class syntax {
    public static void main(String[] args) {
        System.out.println("Hello");
        harsh();
    }

    //output = hello manu imran harsh

    public static void harsh() {
        manu();
        System.out.println("harsh");
    }

    public static void imran() {
        System.out.println("Imran");

    }

    public static void manu() {
        System.out.println("Manu");
        imran();

    }
}
