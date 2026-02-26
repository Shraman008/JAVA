public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,2,3,78,-2,-45};
        int target = 78;
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
           if(arr[i] == target){
            System.out.println("Target found at index "+i);
            flag = true;
            break;
           }
           
        } 
        if(flag == false) System.out.println("Target does not exists");
        
    }
}
