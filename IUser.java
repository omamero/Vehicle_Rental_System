package Vehicle_Rental_System;


public interface IUser {


    public void registerUser(String firstName, String secondName, String lastName, String phoneNumber, String email, String password, String userID, int age);
    public void logInUser();
    public void logOutUser();
    public void setUserName(String firstName, String secondName, String lastName);
    public void setAge(int age);
    public void setPhoneNumber(String phoneNumber);
    public void setEmail(String email);
    public boolean isLoggedIn();
    public void setPassword(String newPassowrd);
    public void setUserID(String userID);


}

