// Abstract class used to remove code duplication and enforce method structure
abstract class Vehicle
{
    int no_of_tyres;

    // Common method to avoid duplication (removes disadvantage #2)
    void displayTyres()
    {
        System.out.println("This vehicle has " + no_of_tyres + " tyres.");
    }

    // Abstract method to enforce implementation in all subclasses (removes disadvantage #3)
    abstract void start();
}

// Car class extends abstract class and provides its own implementation
class Car extends Vehicle
{
    Car()
    {
        no_of_tyres = 4;
    }

    // Required by abstract class - enforces structure (removes disadvantage #3)
    @Override
    void start()
    {
        System.out.println("Car starts with key ignition.");
    }
}

// Scooter class also extends abstract class
class Scooter extends Vehicle
{
    Scooter()
    {
        no_of_tyres = 2;
    }

    @Override
    void start()
    {
        System.out.println("Scooter starts with kick or self-start.");
    }
}

// Main class to test polymorphism and abstraction
public class Abstraction
{
    public static void main(String[] args)
    {
        // Using polymorphism (removes disadvantage #1)
        Vehicle myVehicle1 = new Car();
        myVehicle1.displayTyres();
        myVehicle1.start();

        System.out.println();

        Vehicle myVehicle2 = new Scooter();
        myVehicle2.displayTyres();
        myVehicle2.start();

        // Easier to scale and add new vehicle types consistently (removes disadvantage #4)
    }
}