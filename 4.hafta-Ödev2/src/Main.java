import Abstract.CustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        LocalDate date = LocalDate.of(2000,12,20);

        Customer customer = new Customer();
        customer.setFirstName("Emine");
        customer.setId(1);
        customer.setLastName("Güneş");
        customer.setNationalityId("71452039146");
        customer.setDateOfBirth(date);
        customerManager.add(customer);

    }
}
