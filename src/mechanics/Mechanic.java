package mechanics;
import transport.Transport;

public class Mechanic<T extends Transport> {
    private final String fullName;
    private final String company;
    private T transport;


    public Mechanic(String fullName, String company) {
        this.company = company;
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "default";
        } else {
            this.fullName = fullName;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }

    public void fixCar() {
        System.out.println("Механник " + fullName + " начал чинить " + transport.getBrand());
    }

    public void maintenance() {
        System.out.println("Техобслуживание транспорта: " + transport.getBrand() + " Механик: " + fullName);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullName='" + fullName + '\'' +
                ", company='" + company + '\'' +
                ", transport=" + transport +
                '}';
    }
}
