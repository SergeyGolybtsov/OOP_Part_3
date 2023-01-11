import transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver № " + i, true, 5 + i);

            Car car = new Car("Car brand № " + i, "Car model № " + i, 1.6, driverB);

            DriverC driverC = new DriverC("Driver № " + i, true, 7 + i);

            trucks trucks = new trucks("Car brand № " + i, "Car model № " + i, 4.5, driverC);

            DriverD driverD = new DriverD("Driver № " + i, true, 10 + i);

            Bus bus = new Bus("Car brand № " + i, "Car model № " + i, 4.0, driverD);

            printInfo(car);
            printInfo(bus);
            printInfo(trucks);
        }

    }
    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " зправляет автомобилем "+ transport.getBrand() +" и будет участвовать в заезде");
    }
}
