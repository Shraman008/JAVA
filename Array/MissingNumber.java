import java.util.*;

public class MissingNumber {

    static int missingNum(int arr[]) {
        int n = arr.length + 1;

        long sum = (long) n * (n + 1) / 2;  // prevent overflow
        long arrSum = 0;

        for (int ele : arr) {
            arrSum += ele;
        }

        return (int) (sum - arrSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input:
        // First enter size of array
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(missingNum(arr));

        sc.close();
    }
}