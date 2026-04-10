public class Example {
    
    public static void shravan() {
        karan();
        System.out.println("khusi");
    }

    public static void karan() {
        System.out.println("yashika");
    }

    public static void riyanshi() {
        karan();
        shravan();
        System.out.println("ajay");
        shravan();
    }

    public static void main(String[] args) {
        System.out.println("Ajay");
        shravan();
    }
}
