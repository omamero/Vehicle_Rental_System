package Vehicle_Rental_System;

public class Van extends Vehicle {
    // Private attributes specific to Van
    private double cargoSpaceFt; // Cargo space in feet
    private double maxLoadKg;    // Maximum load in kilograms

    // Constructor
    public Van(String vehicleID, String name, String model, String fuelType, 
               int year, double price, int noSeats, String make, 
               String color, boolean hasInsurance, boolean isAvailable,
               double cargoSpaceFt, double maxLoadKg) {
        // Call the constructor of the parent Vehicle class
        super(vehicleID, name, model, fuelType, year, price, noSeats, make, color, hasInsurance, isAvailable);
        this.cargoSpaceFt = cargoSpaceFt;
        this.maxLoadKg = maxLoadKg;
    }

    // Getters and Setters for cargo space and max load
    public double getCargoSpace() {
        return cargoSpaceFt;
    }

    public void setCargoSpace(double cargoSpaceFt) {
        this.cargoSpaceFt = cargoSpaceFt;
    }

    public double getMaxLoad() {
        return maxLoadKg;
    }

    public void setMaxLoad(double maxLoadKg) {
        this.maxLoadKg = maxLoadKg;
    }

    // Overriding the method to include additional information for Van
    @Override
    public void getVehicleInfo() {
        super.getVehicleInfo(); // Call the parent method to get common info
        System.out.println("Cargo Space: " + cargoSpaceFt + " ft");
        System.out.println("Max Load: " + maxLoadKg + " kg");
    }
}
