package Strings;

public class StringBuilderBasics {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // initial phase m capacity by default 16 hoti h
        System.out.println(sb.length() +" "+ sb.capacity());
        sb.append("sachin");
        System.out.println(sb.length() +" "+ sb.capacity());
        System.out.println(sb);

        sb.setCharAt(1 , 'o');
        System.out.println(sb);

//        String str = sb.toString();
//        System.out.println(str);

        sb.append("sachinkumarkusjwahajajfskjd2345");
        System.out.println(sb.length() +" "+ sb.capacity());






    }
}
