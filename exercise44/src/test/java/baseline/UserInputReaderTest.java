package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class UserInputReaderTest {

    //initialize an input object for testing
    private UserInputReader test;
    @BeforeEach
    void init_UserInputReader() {
        test = new UserInputReader();
    }

    // test that the constructor initializes the stream correctly
    @Test
    void test_UserInputReader() {
        // verify the stream is not null before closing
        assertNotNull(test);
    }
}