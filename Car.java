public class Car extends Vehicle {
    private int doors; // number of doors

    // Constructor
    Car(int passengers, String colour, int maxSpeed, int wheels, int doors) {
        super(passengers, colour, maxSpeed, wheels);
        this.doors = doors;
    }

    // Display the car's details
    void display() {
        super.display();
        System.out.println("Doors: " + doors);
    }

    public static void main(String[] args) {
        Car car = new Car(4, "red", 200, 4,4);
        car.display();
        Car jasontheogoat = new Car (7, "Detonator Yellow", 600, 6);
        jasonthegoat.display();
    }
}
