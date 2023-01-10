import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car carLada = new Car("Lada", "Granta", 1.7, "желтого", 2015, "России", "механическая", "седан", "а777мр68", 5, true, true, true, 220);
        Car carAudi = new Car("Audi", "A8 50L TDI quattro", 3.0, "", 2020, "Германия", "автоматическая", "седан", "а777мр68", 5, true, true, true, 220);
        Car carBmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "автоматическая", "седан", "а777мр68", 5, true, true, true, 220);
        Car carKia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южной Корее", "автоматическая", "седан", "а777мр68", 5, true, true, true, 220);
        Car carHyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее", "автоматическая", "седан", "а777мр68", 5, true, true, true, 220);

        Bus busOne = new Bus("ПАЗ", "3205", 3.8, "белого", 1989,"Россия", 80);
        Bus busTwo = new Bus("ЛиАЗ", "667", 4.8, "желтого", 1963,"Россия", 90);
        Bus busThree = new Bus("ЛиАз", "5292", 5.7, "синего", 2004,"Россия", 100);

        System.out.println(carLada);
        System.out.println(carAudi);
        System.out.println(carBmw);
        System.out.println(carKia);
        System.out.println(carHyundai);

        System.out.println();

        System.out.println(busOne);
        System.out.println(busTwo);
        System.out.println(busThree);
    }
}
