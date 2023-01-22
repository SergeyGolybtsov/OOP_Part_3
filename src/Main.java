import mechanics.Mechanic;
import transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver № " + i, false, 5 + i);

            Car car = new Car("Car brand № " + i, "Car model № " + i, 1.6, driverB);

            DriverC driverC = new DriverC("Driver № " + i, false, 7 + i);

            Truck truck = new Truck("Truck brand № " + i, "Car model № " + i, 4.5, driverC);

            DriverD driverD = new DriverD("Driver № " + i, true, 10 + i);

            Bus bus = new Bus("Bus brand № " + i, "Car model № " + i, 4.0, driverD);

            printInfo(car);
            car.setBodyType(Car.bodyTypes.CUV);
            car.printType();
            try {
                car.passDiagnostics();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Mechanic mechanicCar = new Mechanic("Magomed", "FastRepair");
            mechanicCar.setTransport(car);
            mechanicCar.fixCar();
            mechanicCar.maintenance();

            printInfo(bus);
            bus.setCapacity(Bus.Capacity.EXTRA_SMALL);
            bus.printType();
            try {
                bus.passDiagnostics();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Mechanic mechanicBus = new Mechanic("Kit", "Kitti");
            mechanicBus.setTransport(bus);
            mechanicBus.fixCar();
            mechanicBus.maintenance();

            printInfo(truck);
            truck.setCarrying(Truck.Carrying.N3);
            truck.printType();
            try {
                truck.passDiagnostics();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Mechanic mechanicTruck = new Mechanic("Gorilla", "Semechka");
            mechanicTruck.setTransport(truck);
            mechanicTruck.fixCar();
            mechanicTruck.maintenance();
        }
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " зправляет автомобиль " + transport.getBrand() + " и будет участвовать в заезде");
    }
}
