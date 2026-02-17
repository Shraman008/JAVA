import java.util.Stack;
public class PrefixToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";  // ans (9-(((5+3)*4)/6))
        Stack<String> st = new Stack<>();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>= 48 && ascii<= 57){
                st.push(ch+"");
            }else{
                String v2 = st.pop();
                String v1 = st.pop();
                char op = ch;
                String t = "(" + v2 + op + v1 + ")";
                st.push(t);
            }

        }
        System.out.println(st.peek());
    }
}
