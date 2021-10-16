package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDatabaseTest {

    // declare a product database for testing
    private ProductDatabase database;

    // initialize database with 3 test products
    // Note: 3 is arbitrary
    @BeforeEach
    void init_ProductDatabase() {
        database = new ProductDatabase();

        database.addProductToList(new Product("name1","price1","quantity1"));
        database.addProductToList(new Product("name2","price2","quantity2"));
        database.addProductToList(new Product("name3","price3","quantity3"));
    }

    // test that adding a product to the list successfully appends it to the end
    @Test
    void addProductToList() {
        database.addProductToList(new Product("test","test","test"));

        // find the product
        assertTrue(database.findProductInList("test"));
    }

    // test that the method that finds a product finds the right index
    @Test
    void findProductInList() {
        // find existing value
        assertTrue(database.findProductInList("name2"));

        // assert the current position index was set to the correct value
        assertEquals(1,database.getCurrentPosition());

        // assert that fail cases return false
        assertFalse(database.findProductInList("name4"));
    }
}