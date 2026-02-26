public class RotateArray {

    // Function to rotate array to the left by d positions
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        if (n == 0) return;

        d = d % n;  // Handle d > n

        reverse(arr, 0, d - 1);     // Reverse first d elements
        reverse(arr, d, n - 1);     // Reverse remaining elements
        reverse(arr, 0, n - 1);     // Reverse entire array
    }

    // Function to reverse part of the array
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        rotateArr(arr, d);

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}