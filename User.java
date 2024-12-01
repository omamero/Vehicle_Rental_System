package Vehicle_Rental_System;



public abstract class User {
    
    private String firstName;
    private String secondName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private String userID;
    private int age;
    private boolean isLoggedIn;


    User() {
    
    }


    public void registerUser(String firstName, String secondName, String lastName, String phoneNumber, String email, String password, String userID, int age) {

        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.userID = userID;
        this.age = age;
    }

    public void logInUser() {

        if (isLoggedIn) {

            System.out.print("\n\n  ! -- You are already logged in -- !");
        }
        else {
            System.out.print("\n\n  -- You have successfully logged in --");
            isLoggedIn = true;
        }
    }

    public void logOutUser() {

        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.printf("  -- You have successfully logged out -- ");
        }
        else {
            System.out.println("  -- You are already logged out -- ");
        }
    }

    public void setUserName(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return ("" + this.firstName + " " + this.secondName + " " + this.lastName);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String newPassowrd) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return this.userID;
    }

    public boolean isLoggedIn() {
        
        if (isLoggedIn) {
            return true;
        }
        else {
            return false;
        }
    }

}
