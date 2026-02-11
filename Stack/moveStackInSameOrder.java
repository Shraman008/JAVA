import java.util.Scanner;
import java.util.Stack;
public class moveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements you want to enter : ");
        n = sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        // reverse order
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            // int x = st.peek();
            // rt.push(x);
            // st.pop();
            rt.push(st.pop());
        }
        Stack<Integer> gt = new Stack<>();
        while(rt.size() > 0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
         
    }
}
