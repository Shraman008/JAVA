import java.util.Arrays;

public class ShallowDeepCopy{
    public static void main(String[] args) {
        int a = 4;
        int[] arr = {1,2,3,4,5};
        // int[] x = arr; // x is shallow copy of arr
        // x[0] = 100;
        int[] y = Arrays.copyOf(arr, arr.length); // deep copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}