//part A
interface Amphibious {
    void dock();
    void launch();
}

interface AirVehicle {
    void takeOff();
    void land();
}

class AmphibiousPlane implements Amphibious, AirVehicle {
    @Override
    public void dock() {
        System.out.println("amphibious plane docks.");
    }
    @Override
    public void launch() {
        System.out.println("amphibious plane launches.");
    }
    @Override
    public void takeOff() {
        System.out.println("amphibious plane takes off.");
    }
    @Override
    public void land() {
        System.out.println("amphibious plane lands.");
    }
}

public class InterfaceAbstractDemo {
    public static void main(String[] args) {
        AmphibiousPlane amphibiousPlane = new AmphibiousPlane();
        amphibiousPlane.dock();
        amphibiousPlane.launch();
        amphibiousPlane.takeOff();
        amphibiousPlane.land();
    }
}


//part B
abstract class ElectricVehicle {
    abstract void batteryType();
}

class ElectricCar extends ElectricVehicle {
    @Override
    void batteryType() {
        System.out.println("This electric car uses car batteries.");
    }
}

class ElectricBike extends ElectricVehicle {
    @Override
    void batteryType() {
        System.out.println("This electric bike uses bike batteries.");
    }
}

public class InterfaceAndAbstractClassDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.batteryType();

        ElectricBike electricBike = new ElectricBike();
        electricBike.batteryType();
    }
}
