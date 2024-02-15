public class VehicleRentalService {
    public void rentVehicle(String vehicleType, int rentalDuration, boolean insuranceIncluded) {
        if (vehicleType.equals("car")) {
            rentCar(rentalDuration, insuranceIncluded);
        } else if (vehicleType.equals("bike")) {
            rentBike(rentalDuration);
        } else if (vehicleType.equals("scooter")) {
            rentScooter(rentalDuration);
        } else {
            System.out.println("Sorry, we don't have that type of vehicle available for rental.");
        }
    }
    private void rentCar(int rentalDuration, boolean insuranceIncluded) {
        // Logic for renting a car
        System.out.println("Renting a car for " + rentalDuration + " days.");
        if (insuranceIncluded) {
            System.out.println("Insurance is included.");
        } else {
            System.out.println("Insurance is not included.");
        }
    }
    private void rentBike(int rentalDuration) {
        // Logic for renting a bike
        System.out.println("Renting a bike for " + rentalDuration + " days.");
    }
    private void rentScooter(int rentalDuration) {
        // Logic for renting a scooter
        System.out.println("Renting a scooter for " + rentalDuration + " days.");
    }
    public static void main(String[] args) {
        VehicleRentalService rentalService = new VehicleRentalService();
        rentalService.rentVehicle("car", 7, true);
        rentalService.rentVehicle("bike", 3, false);
        rentalService.rentVehicle("scooter", 2, true);
        rentalService.rentVehicle("truck", 5, false); // Non-existent vehicle type
    }
}
