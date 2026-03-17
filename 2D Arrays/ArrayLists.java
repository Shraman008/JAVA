
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);a.add(5);a.add(7);a.add(8);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);b.add(5);b.add(4);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(1);c.add(2);c.add(10);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        // for(int i=0; i<arr.size(); i++){
        //     for(int j=0; j<arr.get(i).size(); j++){
        //         System.out.print(arr.get(i).get(j)+ " ");
        //     }
        //     System.out.println();
        // }

        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
