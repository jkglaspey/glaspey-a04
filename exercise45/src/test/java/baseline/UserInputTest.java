package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {

    // test that the constructor initializes the stream

    @Test
    void streamExists() {
        // create UserInput object
        UserInput test = new UserInput();

        // assert it initialized
        assertNotNull(test.getInputStream());

        // close stream
        test.getInputStream().close();
    }
}