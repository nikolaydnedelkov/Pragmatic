package customers.rest;

import customers.repository.Customer;
import customers.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void addCustomer(@RequestBody  final Customer customer) {
        customerService.addCustomer(customer);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable final long id) {
        customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable final long id) {
        return customerService.getCustomer(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PutMapping
    public void update(@RequestBody final Customer customer) {
        customerService.update(customer);
    }
}
