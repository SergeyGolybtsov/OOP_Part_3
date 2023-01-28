import mechanics.Mechanic;
import transport.*;

import java.util.*;

import static javax.swing.UIManager.put;

public class Main {
    public static Set<Driver> drivers = new HashSet<>();
    public static Set<Transport<?>> transports = new HashSet<>();
    public static Map<Transport<?>, Set<Mechanic<?>>> mechanics = new HashMap<>();



    public static void main(String[] args) {
       // for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver №1 ", false, 5);

            Car car = new Car("Car brand №1 ", "Car model №1 ", 1.6, driverB);
            Car car2 = new Car("Car brand №1 ", "Car model №1 ", 1.6, driverB);

            DriverC driverC = new DriverC("Driver №2 ", false, 7);

            Truck truck = new Truck("Truck brand №2 ", "Car model №2 ", 4.5, driverC);

            DriverD driverD = new DriverD("Driver №3 ", true, 10);

            Bus bus = new Bus("Bus brand №3 ", "Car model №3 ", 4.0, driverD);

            transports.add(car);
            transports.add(car2);
            transports.add(truck);

            DriverB bDriver = car.getDriver();
            DriverC cDriver = truck.getDriver();
            drivers.add(bDriver);
            drivers.add(cDriver);

            Mechanic<Car> carMechanic = new Mechanic<>("Иван", "Крестный");
            Mechanic<Car> carMechanic2 = new Mechanic<>("Игорь", "Дядя");
            Mechanic<Car> carMechanic3 = new Mechanic<>("Женя", "Знакомый");
            Mechanic<Truck> truckMechanic = new Mechanic<>("Васька", "Мой Кот");

            putMechanics(car, carMechanic, carMechanic2, carMechanic3);
            putMechanics(truck, truckMechanic);

            System.out.println(transports);
            System.out.println(mechanics.get(car));
            System.out.println(mechanics.get(truck));

            Iterator<Driver> iter = drivers.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
          /*  printInfo(car);
            car.setBodyType(Car.bodyTypes.CUV);
            car.printType();
            try {
                car.passDiagnostics();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            mechanic.setTransport(car);
            mechanicCar.fixCar();
            mechanicCar.maintenance();
            System.out.println("__________________________________________");

            putMechanics(car,mechanicCar,carMechanic,carMechanic2);


            printInfo(bus);
            bus.setCapacity(Bus.Capacity.EXTRA_SMALL);
            bus.printType();
            try {
                bus.passDiagnostics();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

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

            mechanicTruck.setTransport(truck);
            mechanicTruck.fixCar();
            mechanicTruck.maintenance();*/
    }

    public static void putMechanics(Transport<?> transport, Mechanic<?>...mechanics) {
        Set<Mechanic<?>> mechanics1 = new HashSet<>(List.of(mechanics));
        Main.mechanics.put(transport, mechanics1);
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " зправляет автомобиль " + transport.getBrand() + " и будет участвовать в заезде");
    }
}
