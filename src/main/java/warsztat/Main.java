package warsztat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Kamil", "Surma");
        Mechanic mechanic = new Mechanic("Jan", "Kowalski");
        Mechanic mechanic2 = new Mechanic("Jan", "Nowak");
        Brand brand = new Brand("Toyota");
        Model model = new Model("Avensis");
        Vehicle vehicle = new Vehicle("01B23230", "WB8476B", brand, model, customer);

        customer.getListVehicle().add(vehicle);

        Service service = new Service("Painting bumper", new BigDecimal("600.00"));
        Service service2 = new Service("Changes Glasses", new BigDecimal("1240.50"));

        Repair repair = new Repair(customer, vehicle, LocalDate.of(2019, 8, 15));
        repair.addService(service);
        repair.addService(service2);

        repair.getMechanics().add(mechanic);
        repair.getMechanics().add(mechanic);

        vehicle.getRepairs().add(repair);

        System.out.println(customer.getListVehicle().size());

        for (Vehicle v : customer.getListVehicle()) {

            System.out.println(v.getRegisterNumber() + ": " + v.getRepairs().size());
        }

        BigDecimal sum = BigDecimal.ZERO;

        for (Vehicle v : customer.getListVehicle()) {

            for (Repair r : v.getRepairs()) {

                sum = sum.add(r.getTotalPrice());

            }
        }
        System.out.println(sum.toString());


        for (Vehicle v : customer.getListVehicle()) {


            for (Repair r : v.getRepairs()) {

                System.out.println(r.getMechanics().size());
            }

        }

        for (Vehicle v : customer.getListVehicle()) {

            for (Repair r : v.getRepairs()) {

                if (r.getDate().isBefore(LocalDate.now().minusDays(7))) {

                    System.out.println("Data jest sprzed 7 dni");
                } else {

                    System.out.println("Data jest późniejsza");

                }


            }

        }
    }
}
