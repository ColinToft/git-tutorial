class Vehicle {
    static int count = 0; // number of vehicles

    private int passengers; // number of passengers

    private String colour; // colour of the vehicle

    private int maxSpeed; // maximum speed of the vehicle in km/h

    // Constructor
    Vehicle(int passengers, String colour, int maxSpeed) {
        this.passengers = passengers;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        count++;
    }

    // Display the vehicle's details
    void display() {
        // TODO
    }
}
