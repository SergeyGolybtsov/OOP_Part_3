package transport;

public class Bus extends Transport<DriverD> {
    public enum Capacity {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MEDIUM(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        private Integer minCapacity;
        private Integer maxCapacity;

        Capacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        @Override
        public String toString() {
            return String.format("Вместимость: %s %s", (minCapacity != null ? "от " + minCapacity + " человек" : ""),
                    maxCapacity != null ? "до " + maxCapacity + " человек" : "");
        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void passDiagnostics() {
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(capacity);
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
        int bestTime = (int) (min + (max - min) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах " + bestTime);
    }

    @Override
    public void maxSpeed() {
        int min = 80;
        int max = 120;
        int maxSpeed = (int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость для автобуса " + maxSpeed);
    }
}

