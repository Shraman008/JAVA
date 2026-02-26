
import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(8);
        arr.add(45);
        arr.add(10);
        arr.add(89);

        System.out.println(arr.get(2));
        arr.set(3,82);
        System.out.println(arr);
        int n = arr.size();
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
         arr.remove(arr.size()-1);
         System.out.print(arr);
        
         // reverse
         int i=0, j=arr.size()-1;
         while(i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
         }
         System.out.print(arr);
         // Collections.reverse(arr);
    }
}
