package warsztat;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String vin;
    private String registerNumber;
    private Brand brand;
    private Model model;
    private Customer owner;
    private List<Repair> repairs;

    public Vehicle(String vin, String registerNumber, Brand brand, Model model, Customer owner) {
        this.vin = vin;
        this.registerNumber = registerNumber;
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.repairs = new ArrayList<>();

    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }
}
