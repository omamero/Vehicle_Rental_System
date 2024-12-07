package Vehicle_Rental_System;

public class Admin extends User {
    

    private static final String AUTHORIZE_CODE = "authorize12!@";

    Admin() {

    }

    public static boolean isAuthorized(String authorizeCode) {

        if (authorizeCode.equals(Admin.AUTHORIZE_CODE)) {
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
