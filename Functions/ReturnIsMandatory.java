public class ReturnIsMandatory {
    public static void main(String[] args) {
        System.out.println(annya(3));
    }
    public static int annya(int a){
        if(a<5){
            return a;
        }
        return -9;
    }
}
