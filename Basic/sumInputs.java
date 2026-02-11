import java.util.Scanner;
public class sumInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = sc.nextInt();
        System.out.println("Enter the second number : ");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("The sum is : "+sum);

        sc.close();
    }
}
