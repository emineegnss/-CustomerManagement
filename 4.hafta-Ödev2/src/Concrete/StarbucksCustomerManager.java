package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends CustomerManager  {
    private CustomerCheckService customerCheckService;
    public StarbucksCustomerManager(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }
    @Override
    public void add(Customer customer) {

        if (customerCheckService.checkIfRealPerson(customer)){
            super.add(customer);
        }else{
            System.out.println("Veritabanına kaydedilmedi. ");
        }


    }



}
