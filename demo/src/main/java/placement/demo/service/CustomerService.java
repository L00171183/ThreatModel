package placement.demo.service;

import placement.demo.domain.Customer;
import placement.demo.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);


    public List<Customer> getCustomerByName(String name) {
        log.info("Getting customer {} from the repository.", name);

        List<Customer> customerList = customerRepository.findByName(name);

        if (CollectionUtils.isEmpty(customerList)) {
            log.info("No customer found by name {}", name);
            return new ArrayList<Customer>();
        }
        log.info("found {} customers by name {}", customerList.size(), name);
        return customerList;
    }






    public Customer addCustomer(Customer customer) {
        log.info("Adding customer {} to database", customer.getName());
        Customer customer2 = customerRepository.save(customer);
        log.info("Added customer {} successfully", customer2.getName());
        return customer2;
    }

}
