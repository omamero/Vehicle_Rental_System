package Vehicle_Rental_System;

import java.util.Date;

public class Booking extends Payment {
    // Attributes
    private VehicleManager vehicleManager;
    private Vehicle vehicle;
    private Date bookingDate;
    private Date fromDate;
    private Date toDate;
    private int rentPeriodHr;
    public boolean isBookingApproved;

    // Constructor
    public Booking(Vehicle vehicle, Date bookingDate, Date fromDate, Date toDate, double totalAmount, String currency, Date paymentDate) {
        super(totalAmount, currency, paymentDate); // Call the Payment constructor
        this.vehicle = vehicle;
        this.bookingDate = bookingDate;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.rentPeriodHr = 0;
        this.isBookingApproved = false;
    }

    // Setters and Getters
    public void setFromToDate(Date fromDate, Date toDate) {
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setRentPeriod(double hours) {
        this.rentPeriodHr = (int) hours;
    }

    public double getRentPeriod() {
        return rentPeriodHr;
    }

    // Business Logic
    public void createBooking(Vehicle vehicle, Date bookingDate, Date fromDate, Date toDate) {
        this.vehicle = vehicle;
        this.bookingDate = bookingDate;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public void cancelBooking(Vehicle vehicle) {
        if (this.vehicle == vehicle) {
            this.vehicle = null;
            this.bookingDate = null;
            this.fromDate = null;
            this.toDate = null;
        }
    }


}

