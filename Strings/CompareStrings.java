import java.util.Scanner;

public class CompareStrings {

    public static int compareToCustom(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int minLen = Math.min(n1, n2);

        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        return n1 - n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int result = compareToCustom(s1, s2);

        if (result == 0) {
            System.out.println("Both strings are equal");
        } else if (result > 0) {
            System.out.println("First string is greater");
        } else {
            System.out.println("Second string is greater");
        }

        sc.close();
    }
}