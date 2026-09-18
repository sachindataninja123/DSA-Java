package Strings;

public class plusOptr {
    static void main(String[] args) {
//        String s = "bhakti";
//
//        s = s + " hi sakti hai ";
//        s += 20;
//        s += '\n';
//        s += 'n';
//
//        System.out.println(s);

        System.out.println("hello" + 12 + 14); // hello1214
        System.out.println("hello" + (12 + 14)); // hello26
        System.out.println(13 + "hello" + 12); // 13hello12
        System.out.println(12 + 14 + "hello"); // 26hello
        System.out.println('A' + "hello"); // Ahello
        System.out.println('A' + 5 + "hello"); // 70hello
        System.out.println('a' + 1 + "hello"); // 98hello

    }
}
