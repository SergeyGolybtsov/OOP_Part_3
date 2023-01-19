package transport;

public class Truck extends Transport<DriverC> {
    public enum Carrying {
        N1(null, 3.5),
        N2(3.5, 12.0),
        N3(12.0, null);

        final Double minValue;
        final Double maxValue;

        Carrying(Double minValue, Double maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        @Override
        public String toString() {
            return String.format("Грузоподъёмность: %s %s", (minValue != null ? "от " + minValue + " тонн" : ""),
                    maxValue != null ? "до " + maxValue + " тонн" : "");
        }
    }

    private Carrying carrying;

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }
    public class CanFindLicense extends Exception {
        public CanFindLicense(String errorMessage) {
            super(errorMessage);
        }
    }
    @Override
    public void passDiagnostics() {
        try{
            if (!getDriver().isHasDriverLicense()) {
                throw new Truck.CanFindLicense("У водителя отсутствуют водительские права!");
            }
        } catch (CanFindLicense e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printType() {
        if (carrying == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(carrying);
        }
    }

    public Carrying getCarrying() {
        return carrying;
    }

    public void setCarrying(Carrying carrying) {
        this.carrying = carrying;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик марки " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void theBestCircleTime() {
        int min = 90;
        int max = 140;
        int bestTime = (int) (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min = 90;
        int max = 130;
        int maxSpeed = (int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость для грузовика " + maxSpeed);
    }
}

