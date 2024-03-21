// Scenario 1

public class VehicleRentalService {
    public void rentVehicle(String vehicleType, int durationDays) {
        System.out.println("Renting a " + vehicleType + " for " + durationDays + " days");
    }

    public void rentVehicle(String vehicleType, int durationDays, boolean insuranceIncluded) {
        if (insuranceIncluded) {
            System.out.println("Renting a " + vehicleType + " with insurance for " + durationDays + " days");
        } else {
            System.out.println("Renting a " + vehicleType + " without insurance for " + durationDays + " days");
        }
    }

    public static void main(String[] args) {
        VehicleRentalService rentalService = new VehicleRentalService();

        rentalService.rentVehicle("car", 5);
        rentalService.rentVehicle("bike", 3);

        rentalService.rentVehicle("scooter", 7, true);
    }
}


// Scenario 2

class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Invalid age: " + age + ". Age must be between 0 and 130.");
    }
}

class Patient {
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 130) {
            throw new InvalidAgeException(age);
        }
        this.age = age;
        System.out.println("Age set successfully: " + age);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient = new Patient();
        
        try {
            patient.setAge(25);
            patient.setAge(-10);
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
