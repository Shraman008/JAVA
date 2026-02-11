import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // To take inputs
        System.out.print("Enter Radius : ");
        int radius = sc.nextInt();  // Taking inputs
        double pi = 3.145;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is "+area);

        sc.close();
    }
}
