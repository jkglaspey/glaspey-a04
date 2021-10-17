package baseline;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataInputReaderTest {

    // create test input reader
    DataInputReader test;
    @BeforeEach
    void init_DataInputReader() {
        test = new DataInputReader("./data/exercise46_input.txt");
    }

    // test the method that determines if there is another readable line
    @Test
    void hasNextLine() {
        // initial test
        assertTrue(test.hasNextLine());

        // skip to end
        test.getNextLine();
        test.getNextLine();
        test.getNextLine();
        test.getNextLine();

        // test the end of the file
        assertFalse(test.hasNextLine());
    }

    // test the method that gets a line from an input file
    @Test
    void getNextLine() {
        // test that it reads in text
        assertEquals("badger badger badger",test.getNextLine());
        assertEquals("badger mushroom",test.getNextLine());
    }

    // close stream after each test
    @AfterEach
    void close_stream() {
        test.closeStream();
    }
}