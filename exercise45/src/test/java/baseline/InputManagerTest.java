package baseline;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class InputManagerTest {

    // create test InputManager for testing
    InputManager test;
    @BeforeEach
    void create_InputManager() {
        test = new InputManager("./data/exercise45_input.txt");
    }

    // test method that creates an input stream
    @Test
    void setInputStream() {
        // set the stream to test
        try {
            test.setInputStream();
        }
        // file wasn't created
        catch (FileNotFoundException e) {
            fail("File wasn't created.");
        }

        // assert it created
        assertNotNull(test.getInputStream());
    }

    // test the method that sets the input stream to System.in
    @Test
    void setInputStreamToSystemIn() {
        test.setInputStreamToSystemIn();

        // assert it created
        assertNotNull(test.getInputStream());
    }

    // test the method that returns the declared file
    @Test
    void getInputFile() {
        assertTrue(test.getInputFile().isFile());
    }

    // test the method that gets the input scanner
    @Test
    void getInputStream() {
        // before setting a stream
        assertNull(test.getInputStream());

        try {
            // set the stream to exist
            test.setInputStream();

            // test that the stream was created
            assertNotNull(test.getInputStream());
        }
        // stream failed to create
        catch (FileNotFoundException e) {
            fail("File does not exist");
        }
    }

    // test the method that closes the input scanner
    @Test
    void closeFile() {
        test.closeFile();

        assertNull(test.getInputStream());
    }

    // close the stream after each test
    @AfterEach
    void close_stream() {
        if(test.getInputStream() != null) test.getInputStream().close();
    }
}