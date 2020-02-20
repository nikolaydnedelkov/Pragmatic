package customers.repository;

import lombok.Data;

@Data
public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
