import java.util.Scanner;
public class NegativeValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
