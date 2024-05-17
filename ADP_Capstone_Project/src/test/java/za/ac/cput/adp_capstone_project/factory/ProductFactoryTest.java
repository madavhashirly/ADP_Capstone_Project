package za.ac.cput.adp_capstone_project.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.adp_capstone_project.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductFactoryTest {

    @Test
    void buildProduct() {

        Product product = ProductFactory.buildProduct("A7845", "Virgin", "Body wave curls",
                "24inches, 13x4 lace", "Brown", true, 3500.00);
        assertNotNull(product);
        System.out.println(product);
    }
}