package transport;

public class Car extends Transport<DriverB> {
    public enum bodyTypes {
        SEDAN("седан"),
        HATCHBACK("хетчбек"),
        COUPE("купе"),
        CUV("универсал"),
        SUV("внедорожник"),
        CROSSOVER("кроссовер"),
        PICKUP("пикап"),
        VAN("фургон"),
        MINIVAN("минивэн");
        private String translate;

        bodyTypes(String translate) {
            this.translate = translate;
        }

        @Override
        public String toString() {
            return String.format("Тип кузова: " + translate);
        }
    }

    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    private bodyTypes bodyType;

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void passDiagnostics() {
        if (!getDriver().isHasDriverLicense()) {
            System.out.println("Необходимо указать тип прав!");
        } else if (getDriver().getClass() != DriverB.class) {
            System.out.println("Не верный тип прав водителя");
        } else {
            throw new RuntimeException();
        }
    }

    public bodyTypes getBodyType() {
        return bodyType;
    }

    public void setBodyType(bodyTypes bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автомобиля");
    }

    @Override
    public void theBestCircleTime() {
        int min = 70;
        int max = 120;
        int bestTime = (int) (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min = 100;
        int max = 160;
        int maxSpeed = (int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость для автомобиля " + maxSpeed);
    }
}

