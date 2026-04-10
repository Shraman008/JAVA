import java.util.HashSet;

public class Sets_STL{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // TreeSet<Integer> set = new TreeSet<>();
        set.add(77); set.add(7); set.add(42); set.add(5);
        set.add(63); set.add(77); set.add(54); set.add(10);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(77) + " " + set.contains(12));
        set.remove(77);
        
        System.out.println(set);
    }
}