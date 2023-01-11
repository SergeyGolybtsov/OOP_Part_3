package transport;

public class Car extends Transport<DriverB>{
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
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
        int bestTime =(int) (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min = 100;
        int max = 160;
        int maxSpeed =(int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость для автомобиля " + maxSpeed);
    }
}

