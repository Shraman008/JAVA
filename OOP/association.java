class Address{
    String city = "Delhi";
    String country = "India";

    void displayAddress(){
        System.out.println("City: " +city+ ", Country: " +country);
    }
}

class Student{
    String name = "Roni";
    int rollno = 101;

    // Direct reference to another class
    Address addr = new Address(); // Object created directly inside the class

    void displayInfo(){
        System.out.println("Name: " +name+ ", Roll: " +rollno);
        addr.displayAddress();
    }

}

public class association {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayInfo();
    }
}
