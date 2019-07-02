package warsztat;

import java.math.BigDecimal;
import java.security.Provider;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repair {

    private Customer customer;
    private Vehicle vehicle;
    private List<Service> services;
    private BigDecimal totalPrice;
    private List<Mechanic> mechanics;
    private LocalDate date;

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public Repair(Customer customer, Vehicle vehicle, LocalDate date) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.totalPrice = BigDecimal.ZERO;
        this.services = new ArrayList<>();
        this.mechanics = new ArrayList<>();
        this.date = date;

    }

    public LocalDate getDate() {
        return date;
    }

    public void addService(Service service) {
        services.add(service);
        totalPrice= totalPrice.add(service.getPrice());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
