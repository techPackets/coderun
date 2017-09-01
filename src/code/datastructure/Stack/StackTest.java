package code.datastructure.Stack;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(7);
        st.push(8);
        st.push(19);
        st.push(12);

        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
