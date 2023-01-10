package transport;

public class Car extends Transport {
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsContry;
    private boolean summerTyres;
    private Key key;
    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_SEATS = 5;

    //Конструктор
    public Car( String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int seatsContry, boolean summerTyres, boolean remoteStartEngine, boolean keylessEntry, int maxSpeed) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeed);
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        setTransmission(transmission);
        if (productionYear <= 0) {
            this.productionYear = DEFAULT_YEAR;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isBlank()) {
            this.productionCountry = DEFAULT_VALUE;
        } else {
            this.productionCountry = productionCountry;
        }
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = bodyType;
        }

        if (productionYear <= 0) {
            this.seatsContry = DEFAULT_SEATS;
        } else {
            this.seatsContry = seatsContry;
        }
        setRegistrationNumber(registrationNumber);
        setSummerTyres(summerTyres);
        setKey(remoteStartEngine, keylessEntry);

    }
    //Безключевой доступ
    class Key {
    private final boolean remoterStartEngine;
    private final boolean keylessEntry;

    public Key(boolean remoterStartEngine, boolean keylessEntry) {
        this.remoterStartEngine = remoterStartEngine;
        this.keylessEntry = keylessEntry;
    }

    public boolean isRemoterStartEngine() {
        return remoterStartEngine;
    }

    public boolean isKeylessEntry() {
        return keylessEntry;
    }

        @Override
        public String toString() {
            return "Key{" +
                    "remoterStartEngine=" + remoterStartEngine +
                    ", keylessEntry=" + keylessEntry +
                    '}';
        }
    }

    //Гетеры Сетеры

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = DEFAULT_VALUE;
        } else
            this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else
            this.registrationNumber = registrationNumber;
    }

    public int getSeatsContry() {
        return seatsContry;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    private void setKey(Boolean remoteStartEngine, boolean keylessEntry) {
        this.key = new Key(remoteStartEngine, keylessEntry);
    }


    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }
    public void changeTyres(int month) {
        if (month >= 4 && month <= 10) {
            setSummerTyres(true);
        } else {
            setSummerTyres(false);
        }
    }

    //тоСтринг

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seatsContry=" + seatsContry +
                ", summerTyres=" + summerTyres +
                ", key=" + key +
                ", maxSpeed=" + maxSpeed +
                '}';

    }
}
