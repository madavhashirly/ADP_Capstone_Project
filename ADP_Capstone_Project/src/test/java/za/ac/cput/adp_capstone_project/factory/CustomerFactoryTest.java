package za.ac.cput.adp_capstone_project.factory;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.adp_capstone_project.domain.Address;
import za.ac.cput.adp_capstone_project.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerFactoryTest {

private Customer customer;
private Address address;


    @Test
    void buildCust() {
        address = AddressFactory.buildAdd(2567234L,12,"Marlin","Cape Town",7798);
        assertNotNull(address);
        System.out.println(address);
        customer = CustomerFactory.buildCust(8765875L,"John","Doe", 82564732L, address);
         assertNotNull(customer);
         System.out.println(customer);
    }
}