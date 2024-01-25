class Vehicle {
    String brand;
    String model;
    int year;
    int speed;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    void accelerate() {
        this.speed += 10;
        System.out.println("The " + model + " is accelerating. Current speed: " + speed + " km/h");
    }

    void brake() {
        this.speed -= 5;
        System.out.println("The " + model + " is braking. Current speed: " + speed + " km/h");
    }
}

class Motorcycle extends Vehicle {
    boolean hasHelmetStorage;
    int numWheels;

    public Motorcycle(String brand, String model, int year, boolean hasHelmetStorage) {
        super(brand, model, year);
        this.hasHelmetStorage = hasHelmetStorage;
        this.numWheels = 2;
    }

    void performWheelie() {
        System.out.println("The " + model + " is performing a wheelie!");
    }

    void park() {
        System.out.println("The " + model + " is parking. Remember to lock your helmet in the storage.");
    }
}

class Bus extends Vehicle {
    int passengerCapacity;
    int numDoors;

    public Bus(String brand, String model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
        this.numDoors = 2;
    }

    void openDoors() {
        System.out.println("The " + model + " is opening its doors for passengers.");
    }

    void announceArrival() {
        System.out.println("Attention, the " + model + " has arrived at the destination. Please exit through the rear doors.");
    }
}

class Trailer extends Vehicle {
    int maxLoadCapacity;
    int numAxles;

    public Trailer(String brand, String model, int year, int maxLoadCapacity) {
        super(brand, model, year);
        this.maxLoadCapacity = maxLoadCapacity;
        this.numAxles = 2;
    }

    void loadCargo() {
        System.out.println("Loading cargo onto the " + model + ". Maximum load capacity: " + maxLoadCapacity + " kg.");
    }

    void unloadCargo() {
        System.out.println("Unloading cargo from the " + model + ". The cargo area is now empty.");
    }
}

class Boat extends Vehicle {
    float waterDisplacement;
    String hullMaterial;

    public Boat(String brand, String model, int year, float waterDisplacement) {
        super(brand, model, year);
        this.waterDisplacement = waterDisplacement;
        this.hullMaterial = "Fiberglass";
    }

    void navigate() {
        System.out.println("The " + model + " is navigating on the water with a displacement of " + waterDisplacement + " tons.");
    }

    void dropAnchor() {
        System.out.println("Dropping anchor from the " + model + ". The boat is now anchored in place.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Motorcycle bike = new Motorcycle("Harley", "Sportster", 2022, true);
        bike.accelerate();
        bike.performWheelie();
        bike.park();

        Bus bus = new Bus("Mercedes", "Sprinter", 2021, 15);
        bus.accelerate();
        bus.openDoors();
        bus.announceArrival();

        Trailer trailer = new Trailer("Utility", "Flatbed", 2020, 5000);
        trailer.loadCargo();
        trailer.unloadCargo();

        Boat boat = new Boat("SeaRay", "Sundancer", 2019, 25.5f);
        boat.navigate();
        boat.dropAnchor();
    }
}
