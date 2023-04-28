package placement.demo.repository;

import placement.demo.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;



import java.util.List;
public interface CustomerRepository extends MongoRepository<Customer, String> {

    List<Customer> findByName(String name);
    List<Customer> findByRole(String role);

}
