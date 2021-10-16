package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    // initialize a new Product
    private Product test;
    @BeforeEach
    void init_Product() {
        test = new Product("test_name","test_price","test_quantity");
    }

    // test that getName returns the next name
    @Test
    void getName() {
        assertEquals("test_name",test.getName());
    }

    // test that getPrice returns the next price
    @Test
    void getPrice() {
        assertEquals("test_price",test.getPrice());
    }

    // test that getQuantity returns the next quantity
    @Test
    void getQuantity() {
        assertEquals("test_quantity",test.getQuantity());
    }
}