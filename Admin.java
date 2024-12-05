package Vehicle_Rental_System;

public class Admin extends User {
    

    private static final String AUTHORIZE_CODE = "@3#dg$%32FR5#Dhj524^#$%l;jdftgq";

    private VehicleManager vehicleManager;


    Admin() {

    }

    public boolean isAuthorized(String authorizeCode) {

        if (authorizeCode == Admin.AUTHORIZE_CODE) {
            return true;
        }

        return false;
    }

    public void approveBooking(Booking book) {
        
        if (book.isBookingApproved) {
            System.out.print("\n\n  ! -- This booking is already approved -- !\n\n");
        }
        else {
            book.isBookingApproved = true;
            System.out.print("  -- This booking has been approved -- ");
        }
    }





}
