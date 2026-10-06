package CollectionFramework;

import java.util.ArrayList;
import java.util.Stack;

public class StackExample {
    static void main(String[] args) {
        Stack <Integer> st = new Stack<>();

        st.push(10);
        System.out.println(st);

        st.push(12);
        System.out.println(st);

        st.push(13);
        System.out.println(st);

        st.pop();
        System.out.println(st);


        System.out.println(st.peek());

        System.out.println(st.search(14));

        System.out.println(st.empty());

    }
}
