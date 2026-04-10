
import java.util.HashSet;

public class TwoSum {
    boolean twoSum(int arr[], int target){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            int rem = target - ele;
            if(set.contains(rem)) return true;
            set.add(ele);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        TwoSum obj = new TwoSum();
        boolean result = obj.twoSum(arr, target);
        if(result){
            System.out.println("Pair exists");
        } else {
            System.out.println("No pair found");
        }
    }
}
