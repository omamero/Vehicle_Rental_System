package Vehicle_Rental_System;

import java.util.Scanner;

public class VehicleManager {


    private static final int MAX_VEHICLES = 100;
    
    //Top-Level Domain
    private static final String TLD = "com";
    
    private Vehicle[] vehicles;
    private int noVehicles;
    private int vehicleReserved;

    VehicleManager() {
        this.vehicles = new Vehicle[VehicleManager.MAX_VEHICLES];
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println(
            "\n\n  ----  WELCOME TO VEHICLE RENTAL SYSTEM  ----  \n\n"
        );

        int userChoice = 0;

        do {

            System.out.print(
                "  ----  LOGIN PORTAL  ----  " + "\n" +
                "\n" +
                "1 - For admins only" + "\n" +
                "2 - For customers" + "\n" +
                "3 - Exit" + "\n" +
                "\n" +
                "Enter your choice: "
            );
            userChoice = scanner.nextInt();
            scanner.nextLine(); // clear buffer


            

            switch (userChoice) {

                case 1:

                    do {
                        int adminChoice = 0;
                        System.out.print(
                            "\n\n  ----  ADMIN LOGIN  ----  "+ "\n" +
                            "\n" +
                            "1 - Admin Register"+ "\n" +
                            "2 - Admin Login"+ "\n" +
                            "0 - Go back to Login Portal"+ "\n" +
                            "\n" +
                            "Enter your choice: "
                        );
                        adminChoice = scanner.nextInt();
                        scanner.nextLine(); // clear buffer

                        

                        switch (adminChoice) {
                            
                            case 1:
                                User admin = new Admin();

                                String firstName = null, secondName, lastName, phoneNumber, email, newPassword, cnofirmPassword, adminID;
                                int age;
                                boolean isValid = false;

                                // first name
                                do {

                                    System.out.print("\n\n  - First name: ");

                                    firstName = scanner.nextLine();
                                    isValid = validateName(firstName);

                                    if (!isValid) {
                                        System.out.print("\n\n  ! -- The name can not be empty and can not have any digit or space-- !");
                                    }

                                } while (!isValid);

                                // second name
                                do {
                                    System.out.print("\n\n  - Second name: ");
                                    secondName = scanner.nextLine();

                                    isValid = validateName(secondName);

                                    if (!isValid) {
                                        System.out.print("\n\n  ! -- The name can not be empty and can not have any digit or space-- !");
                                    }

                                } while (!isValid);

                                // last name
                                do {
                                    System.out.print("\n\n  - Last name: ");
                                    lastName = scanner.nextLine();

                                    isValid = validateName(lastName);

                                    if (!isValid) {
                                        System.out.print("\n\n  ! -- The name can not be empty and can not have any digit or space -- !");
                                    }

                                } while (!isValid);

                                // phone number
                                do {

                                    boolean hasLetter = false;

                                    System.out.print("\n\n - Phone number: ");
                                    phoneNumber = scanner.nextLine();

                                    for (char digit: phoneNumber.toCharArray()) {
                                        
                                        if (!Character.isDigit(digit)) {
                                            hasLetter = true;
                                            break;
                                        }
                                    }

                                    if (hasLetter) {
                                        isValid = false;
                                        System.out.print("\n\n  ! -- Phone number must be digits only with no space -- !");
                                    }
                                    else {
                                        isValid = true;
                                    }
                                    

                                } while (!isValid);

                                // email
                                do {
                                    System.out.print("\n\n - Email: ");
                                    email = scanner.next();
                                    scanner.nextLine(); // clear buffer

                                    isValid = validateEmail(email);

                                    if (!isValid) {
                                        System.out.print("\n\n  ! -- Email is invalid. Please enter email correctly -- !");
                                    }

                                } while (!isValid);

                                // new password
                                do {

                                    System.out.print(
                                        "\n\n  ---- Password Rules ----" + "\n" +
                                        "\n" +
                                        " - Must be at least 8 characters length" + "\n" +
                                        " - Must have at least 2 digits" + "\n" +
                                        " - Must have at least 3 letters" + "\n" +
                                        " - At least 1 letter uppercase and 1 letter lowercase" + "\n" +
                                        " - Must have at least 2 special characters from the following: !@#$%^&*()-_=+[]{}|;:'\\\",.<>?/ " + "\n"
                                    );

                                    System.out.print("\n\n - New password: ");
                                    newPassword = scanner.nextLine();

                                    isValid = validatePassword(newPassword);

                                    if (!isValid) {
                                        System.out.print("\n\n  ! -- Password is invalid. Please check the rules provided -- !");
                                        continue;
                                    }

                                    System.out.print("\n\n - Confirm password: ");
                                    cnofirmPassword = scanner.nextLine();
                                    
                                    if (newPassword.equals(cnofirmPassword)) {
                                        isValid = true;
                                    }
                                    else {
                                        System.out.print("\n\n  ! -- There is no match between the two passwords -- !");
                                        isValid = false;
                                    }
                                    
                                } while (!isValid);

                                

                                break;
                        }

                    } while (userChoice != 0);
                    break;
            }

        } while (true);

        
    }

    public void addVehicle(Vehicle newVehicle) {
        
        this.vehicles[this.noVehicles] = newVehicle; 
    }

    public void updateVehicle(Vehicle oldVehicle, Vehicle newVehicle) {

        for (int i = 0; i < this.noVehicles; i++) {
            
            if (vehicles[i] == oldVehicle) {
                vehicles[i] = newVehicle;

                System.out.println("  -- Updated Successfuly --");
            }

            System.out.println("Couldn't found a vehicle with name: " + oldVehicle.name);
        }
    }

    public void deleteVehicle(Vehicle vehicleToRemove) {

        int indexToRemove = this.searchVehicleIndex(vehicleToRemove);

        if (indexToRemove < 0) {
            System.out.println("  -- There is no vehicle with the name: " + vehicleToRemove.name);
        }
        else {
            for (int i = indexToRemove; i < (this.noVehicles - 1); i++) {
                this.vehicles[i] = this.vehicles[i + 1];
            }
        }
    }

    public boolean isAvailable(Vehicle vehicle) {

        int vehicleIndex = searchVehicleIndex(vehicle);

        if (vehicleIndex < 0) {
            return false;
        }
        else {
            if (this.vehicles[vehicleIndex].isAvailable) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    // if not found: returns -1
    public int searchVehicleIndex(Vehicle vehicle) {

        for (int i = 0; i < this.noVehicles; i++) {
            
            if (this.vehicles[i] == vehicle) {
                return i;
            }
        }

        return -1;
    }

    // returns false if: name is null or has character that is not a letter
    // returns true: otherwise
    public static boolean validateName(String name) {

        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        
        for (int i = 0; i < name.length(); i++) {
            
            if (!Character.isLetter(name.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /*

    returns false if email doesn't have:
        - "@"
        - "." (dot)
        - domain part or local part has symbols
        - TLD (Top-Level Domain) doesn't equal ".com"

    returns true: otherwise
    */
    public static boolean validateEmail(String email) {

        int atIndex = email.indexOf('@');
        int dotIndex = email.indexOf('.');

        // top-level domain
        String userTLD = email.substring(dotIndex + 1);

        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }

        if (dotIndex == -1 || dotIndex == 0 || dotIndex == email.length() - 1) {
            return false;
        }

        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1,  dotIndex);

        
        if (!userTLD.equals(VehicleManager.TLD)) {
            return false;
        }

        for (char letter: localPart.toCharArray()) {
            if (!Character.isLetterOrDigit(letter)) {
                return false;
            }
        }

        for (char letter: domainPart.toCharArray()) {
            if (!Character.isLetterOrDigit(letter)) {
                return false;
            }
        }

        return true;

    }

    public static boolean validatePassword(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        int noUpperCases = 0, noLowerCases = 0, noLetters = 0, noDigits = 0, noSymbols = 0;
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/"; 

        for (char character: password.toCharArray()) {
            
            if (Character.isUpperCase(character)) {
                noUpperCases += 1;
            }
            else if (Character.isLowerCase(character)) {
                noLowerCases += 1;
            }
            else if (Character.isDigit(character)) {
                noDigits += 1;
            }
            else if (specialChars.indexOf(character) >= 0) {
                noSymbols += 1;
            }
            else {
                return false;
            }
        }

        noLetters = noLowerCases + noUpperCases;

        if (noUpperCases >= 1 && noLowerCases >= 1 && noLetters >= 3 && noDigits >= 2 && noSymbols >= 2) {
            return true;
        }
        else {
            return false;
        }
    }
    
}




// System.out.print(
//     " ---- Menu ---- " + "\n" +
//     "\n" +
//     "1 - Add new vehicle " + "\n" +
//     "2 - Update a vehicle " + "\n" +
//     "3 - Delete a vehicle " + "\n" +
//     "4 - Search for a vehicle " + "\n" +
//     "5 - Display available vehicles" + "\n" +
//     "6 - Display all vehicles in the lot " + "\n" +
//     "0 - Exit"
// );