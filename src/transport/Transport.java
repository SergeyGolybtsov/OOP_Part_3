package transport;

import exception.CanFindLicense;
import mechanics.Mechanic;
import java.util.ArrayList;
import java.util.List;
public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    public Transport(String brand, String model, double engineVolume, T driver) {
        if (driver != null) {
            this.driver = driver;
        }
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }
    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }
    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }
    public void showMechanicsInfo() {
        System.out.println("Список всех механиков автомобиля " + brand + ":");
        mechanics.forEach(System.out :: println);
    }
    public T getDriver() {
        return driver;
    }
    public void setDriver(T driver) {
        this.driver = driver;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
    }
    public abstract void passDiagnostics() throws Car.CanFindLicense, CanFindLicense;
    public abstract void printType();
    public abstract void startMove();
    public abstract void finishMove();
    public void printInfo() {
        System.out.println("Водитель " + driver.getName() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде");
    }
    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver +
                ", mechanics=" + mechanics +
                '}';
    }
}