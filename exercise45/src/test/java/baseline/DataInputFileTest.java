package baseline;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataInputFileTest {

    // create test input file
    DataInputFile test;
    @BeforeEach
    void create_DataInputFile() {
        test = new DataInputFile("./data/exercise45_input.txt");
    }

    // test method that determines if there is a "next" line
    @Test
    void hasNextLine() {
        // true case
        assertTrue(test.hasNextLine());

        // skip to end
        test.getNextLine();
        test.getNextLine();
        test.getNextLine();

        // false case
        assertFalse(test.hasNextLine());
    }

    // test method that gets the next line from a file
    @Test
    void getNextLine() {
        assertEquals("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.",
                test.getNextLine());
    }

    // close stream after each test
    @AfterEach
    void close_stream() {
        test.getInputStream().close();
    }
}