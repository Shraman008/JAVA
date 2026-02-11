class Vehicle{
    void start(){
        System.out.println("Vehicle Starts");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Car drives");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}
