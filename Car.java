package Vehicle_Rental_System;

public class Car extends Vehicle {
    // Private attribute
    private String transmissionType;

    // Constructor
    public Car(String vehicleID, String name, String model, String fuelType, 
               int year, double price, int noSeats, String make, String color, 
               String transmissionType, boolean hasInsurance, boolean isAvailable) {
        super(vehicleID, name, model, fuelType, year, price, noSeats, make, 
              color, hasInsurance, isAvailable); // Call to parent class constructor
        this.transmissionType = transmissionType;
    }

    // Getter for transmissionType
    public String getTransmissionType() {
        return transmissionType;
    }

    // Setter for transmissionType
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}
