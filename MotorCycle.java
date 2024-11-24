package Vehicle_Rental_System;

public class MotorCycle extends Vehicle {
    // Private attributes specific to Motorcycle
    private String handleBarType; // Type of handlebar
    private boolean licenseRequired; // Whether a license is required to ride

    // Constructor
    public MotorCycle(String vehicleID, String name, String model, String fuelType, 
                      int year, double price, int noSeats, String make, 
                      String color, String handleBarType, 
                      boolean licenseRequired, boolean isAvailable) {
        // Call the constructor of the parent Vehicle class
        super(vehicleID, name, model, fuelType, year, price, noSeats, make, color, true, isAvailable);
        this.handleBarType = handleBarType;
        this.licenseRequired = licenseRequired;
    }

    // Getter and Setter for handleBarType
    public String getHandleBar() {
        return handleBarType;
    }

    public void setHandleBar(String handleBar) {
        this.handleBarType = handleBar;
    }

    // Getter and Setter for licenseRequired
    public boolean isLicenseRequired() {
        return licenseRequired;
    }

    public void setLicenseRequired(boolean isRequired) {
        this.licenseRequired = isRequired;
    }

    // Overriding the method to include additional information for Motorcycle
    @Override
    public void getVehicleInfo() {
        super.getVehicleInfo(); // Call the parent method to get common info
        System.out.println("Handle Bar Type: " + handleBarType);
        System.out.println("License Required: " + licenseRequired);
    }
}
