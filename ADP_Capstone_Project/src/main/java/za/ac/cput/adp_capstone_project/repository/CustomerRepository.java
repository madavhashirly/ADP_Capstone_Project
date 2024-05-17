package za.ac.cput.adp_capstone_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.adp_capstone_project.domain.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerById(Long customerId);
}
