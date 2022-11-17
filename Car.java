public class Car extends Vehicle {
    private int doors; // number of doors

    // Constructor
    Car(int passengers, String colour, int maxSpeed, int doors) {
        super(passengers, colour, maxSpeed);
        this.doors = doors;
    }

    // Display the car's details
    void display() {
        super.display();
        System.out.println("Doors: " + doors);
    }

    public static void main(String[] args) {
        Car car = new Car(4, "red", 200, 4);
        car.display();
    }
}
