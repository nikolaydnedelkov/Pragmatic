package customers.repository;

import customers.repository.mapper.CustomerRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public CustomerRepository(final NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(final Customer customer) {
        final String sql = "INSERT INTO customers (first_name, last_name, email, password) "
                + "VALUES (:first_name, :last_name, :email, :password)";

        final Map<String, Object> params = new HashMap<>();
        params.put("first_name", customer.getFirstName());
        params.put("last_name", customer.getLastName());
        params.put("email", customer.getEmail());
        params.put("password", customer.getPassword());

        jdbcTemplate.update(sql, params);
    }

    public void delete(final long id) {
        final String sql = "DELETE FROM customers WHERE id = " + id;
        jdbcTemplate.update(sql, new HashMap<>());
    }

    public Customer get(final long id) {
        final String sql = "SELEC * FROM customers WHERE id = " + id;

        return jdbcTemplate.queryForObject(sql, new HashMap<>(), new CustomerRowMapper());
    }

    public List<Customer> getAll() {
        final String sql = "SELECT * FROM customers";
        return jdbcTemplate.query(sql, new CustomerRowMapper());
    }

    public void update(final Customer customer) {
        final String sql = "UPDATE customers "
                + "SET first_name = :first_name,"
                + "last_name = :last_name,"
                + "email = :email,"
                + "password = :password "
                + "WHERE id = :id";

        final Map<String, Object> params = new HashMap<>();
        params.put("id", customer.getId());
        params.put("first_name", customer.getFirstName());
        params.put("last_name", customer.getLastName());
        params.put("email", customer.getEmail());
        params.put("password", customer.getPassword());

        jdbcTemplate.update(sql, params);
    }
}
