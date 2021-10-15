package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputReaderTest {

    //declare a class test object
    InputReader test;

    // initialize the InputReader
    @BeforeEach
    void init_InputReader() {
        test = new InputReader();
    }

    // test that the scanner is not null
    @Test
    void test_InputReader() {
        assertTrue(test != null);
    }
}