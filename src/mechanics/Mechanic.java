package mechanics;
import transport.Transport;

import java.util.Objects;

public class Mechanic<T extends Transport> {
    private final String fullName;
    private final String company;
    private T transport;//Не совсем понял как присвоить этот параметр в метод починки и проверки((((


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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company) && Objects.equals(transport, mechanic.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company, transport);
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
