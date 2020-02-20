package customers.service;

import customers.repository.Customer;

import java.util.List;

public interface CustomerService {

    void addCustomer(Customer customer);

    void deleteCustomer(long id);

    Customer getCustomer(long id);

    List<Customer> getAllCustomers();

    void update(Customer customer);
}
