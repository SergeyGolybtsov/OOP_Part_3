package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, int maxSpeed) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
