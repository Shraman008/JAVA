import java.util.Deque;
import java.util.LinkedList;

public class QueueSTLBasics {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        // dq.addFirst() & dq.addLast()
        // dq.addLast(1);
        // dq.addLast(2);
        // dq.addLast(3);
        // dq.addLast(4);
        // // System.out.println(dq);
        // // dq.addFirst(5);
        // // System.out.println(dq);
        // // dq.removeLast();
        // // System.out.println(dq);
        // // dq.removeFirst();
        // // System.out.println(dq);
        // dq.add(5); // add from back
        // dq.remove(); // first remove
        // System.out.println(dq);
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(1);
        System.out.println(dq);
        dq.removeFirstOccurrence(1);
        System.out.println(dq);

    }
}
