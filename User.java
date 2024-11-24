package Vehicle_Rental_System;



public class User {
    
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


    public void registerUser(String firstNmae, String secondName, String lastName, String phoneNumber, String email, String password, String userID) {

        this.firstName = firstNmae;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.userID = userID;
    }

    public void logInUser(String email, String password) {

        if (isLoggedIn) {
            System.out.println("  -- You are already logged in -- ");
        }
        else {
            if (email != this.email || password != this.password) {
                System.out.println("/n  !!! - Either email or password is incorrect - !!! ");
            }
            else {
                isLoggedIn = true;
            }
        }
    }

    public void logOutUser() {

        if (isLoggedIn) {
            isLoggedIn = false;
            System.out.printf("  -- You have logged out -- ");
        }
        else {
            System.out.println(" -- You are already logged out -- ");
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
