public class RowColumnReverse {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{3,1,8,2,6}};
        int i=0, j=0;
        int m = arr.length, n = arr[0].length;
        for(i=0; i<m; i++){
            for(j=n-1; j>=0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        i = 0;
        j = 0;
        for(i=m-1; i>=0; i--){
            for(j=n-1; j>=0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
