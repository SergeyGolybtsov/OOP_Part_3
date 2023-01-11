package transport;
public class Bus extends Transport<DriverD>{

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус марки " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки " + getBrand() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void theBestCircleTime() {
        int min = 100;
        int max = 150;
        int bestTime =(int) (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min = 80;
        int max = 120;
        int maxSpeed =(int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость для автобуса " + maxSpeed);
    }
}

