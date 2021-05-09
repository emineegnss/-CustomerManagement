package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReference.SRHKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        SRHKPSPublicSoap soap = new SRHKPSPublicSoap();
        try {
            return soap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),customer.getLastName(),customer.getDateOfBirth().getYear());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return true;
    }
}
