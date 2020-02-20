package customers.service.impl;

import customers.repository.Customer;
import customers.repository.CustomerRepository;
import customers.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void addCustomer(final Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public void deleteCustomer(final long id) {
        customerRepository.delete(id);
    }

    @Override
    public Customer getCustomer(final long id) {
        return customerRepository.get(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAll();
    }

    @Override
    public void update(final Customer customer) {
        customerRepository.update(customer);
    }
}
