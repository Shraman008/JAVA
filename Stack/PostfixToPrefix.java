import java.util.Stack;
public class PostfixToPrefix {
    public static void main(String[] args) {
        String str = "953+4*6/-"; // ans -9/*+5346
        Stack<String> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                st.push(ch+"");
            } else {
                String v1 = st.pop();
                String v2 = st.pop();
                char op = ch;
                // v1 v2 op
                String t = op + v2 + v1;
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
}
