
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("raghav");
        System.out.println(s.length() + " " + s.capacity());
        System.out.println(s);
        s.append("garg");
        System.out.println(s);
    }
}
