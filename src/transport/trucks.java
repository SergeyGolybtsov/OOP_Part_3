package transport;

public class trucks extends Transport<DriverC> {
    public trucks(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
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
        int bestTime =(int) (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min = 90;
        int max = 130;
        int maxSpeed =(int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость для грузовика " + maxSpeed);
    }
}
