public class PassingArrayToMethods {
    public static void change(int[] x){
        x[2] = 10;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
}
