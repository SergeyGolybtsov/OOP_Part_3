package transport;

public class Transport {

    protected String brand;
    protected String model;

    protected double engineVolume;

    protected String color;

    protected int productionYear;
    protected String productionCountry;

    protected int maxSpeed;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_SPEED = 220;

//Комнстрнуктор

    public Transport(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, int maxSpeed) {
        setColor(color);
        setMaxSpeed(maxSpeed);
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maxSpeed = maxSpeed;
    }

    //Геттеры Сетеры

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
            this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <=0 || maxSpeed >=260) {
            this.maxSpeed = DEFAULT_SPEED;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}


