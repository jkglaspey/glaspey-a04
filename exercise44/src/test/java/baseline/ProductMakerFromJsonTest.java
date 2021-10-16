package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductMakerFromJsonTest {

    // declare a testing object
    private ProductMakerFromJson json;

    // initialize a json manager using the file path
    @BeforeEach
    void init_JSON() {
        json = new ProductMakerFromJson("data/exercise44_input.json");
    }

    // test that all values were created correctly (indirectly tests ALL the private methods)
    // The method that creates each array calls on the private method to create a json object. That method calls on the
    // success of creating a JavaStreamParser method. That method relies on the constructor.
    // This method also calls getNextProduct() to get the data from the array.
    @Test
    void test_ProductMakerFromJson() {
        Product test1 = json.getNextProduct();
        Product test2 = json.getNextProduct();
        Product test3 = json.getNextProduct();

        // test the names
        assertEquals("Widget",test1.getName());
        assertEquals("Thing",test2.getName());
        assertEquals("Doodad",test3.getName());

        // test the prices
        assertEquals("25.00",test1.getPrice());
        assertEquals("15.00",test2.getPrice());
        assertEquals("5.00",test3.getPrice());

        // test the quantities
        assertEquals("5",test1.getQuantity());
        assertEquals("5",test2.getQuantity());
        assertEquals("10",test3.getQuantity());

    }

    // test the method that returns if there is another value in the json array that can be read
    @Test
    void test_hasUnreadProduct() {
        // test that when called initially, it will read true
        assertTrue(json.hasUnreadProduct());

        // skip to end
        json.getNextProduct();
        json.getNextProduct();
        json.getNextProduct();

        // test that when called with no unread products, it will return false
        assertFalse(json.hasUnreadProduct());
    }

    @Test
    void test_getNextProduct() {
        // test that getNextProduct gets the first product in the file on the first call
        Product p = json.getNextProduct();

        assertEquals("Widget",p.getName());
        assertEquals("25.00",p.getPrice());
        assertEquals("5",p.getQuantity());
    }
}