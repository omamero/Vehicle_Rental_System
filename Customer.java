package Vehicle_Rental_System;

public class Customer extends User {
    // Constants
    private static final int MAX_BOOKINGS = 3;

    // Attributes
    private Booking[] bookings = new Booking[MAX_BOOKINGS];
    private int noVehiclesRented;
    private String licenseType;
    private boolean legalAge;
    private boolean hasLicense;

    // Constructor
    public Customer() {
        super(); // Call the User constructor
        noVehiclesRented = 0;
        licenseType = "";
        legalAge = false;
        hasLicense = false;
    }

    // Setters and Getters
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getLicenseType() {
        return licenseType;
    }

    // Business Logic
    public boolean isEligible() {
        return legalAge && hasLicense;
    }
}

