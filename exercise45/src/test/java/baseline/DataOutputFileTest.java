package baseline;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DataOutputFileTest {

    // create test for each method
    private DataOutputFile test;
    @BeforeEach
    void create_DataOutputFile() {
        // create object
        test = new DataOutputFile("./data/test.txt");
    }

    // test that the output file was assigned correctly
    @Test
    void getOutputFile() {
        // assert the file is not null (meaning it was assigned)
        assertNotNull(test.getOutputFile());
    }

    // test that the output stream was assigned correctly
    @Test
    void getOutputStream() {// assert the stream is not null (meaning it was assigned)
        assertNotNull(test.getOutputStream());
    }

    // test that the output file was created correctly
    @Test
    void test_fileCreatedCorrectly() {
        File testFile = new File("./data/test.txt");
        assertTrue(testFile.isFile());
    }

    @Test
    void writeToFileAndReplace() {// write text to file and replace "yes" with "no"
        test.writeToFileAndReplace("I'm testing the word yes","yes","no");

        // close stream
        test.getOutputStream().close();

        // read string from file
        Scanner testInput;
        try {
            testInput = new Scanner(new File("./data/test.txt"));

            // assert that the line wrote correctly
            assertEquals("I'm testing the word no",testInput.nextLine());

            // close stream
            testInput.close();
        }
        // test file not found exception (but it won't ever happen)
        catch (FileNotFoundException e) {
            fail("Error finding file.");
        }
    }

    // verify the stream is not null so it will close
    @Test
    void closeFile() {
        assertNotNull(test.getOutputStream());
    }

    // close stream and txt
    @AfterEach
    void close_stuff() {
        // delete txt
        if(test.getOutputStream() != null) test.getOutputStream().close();
        test.getOutputFile().delete();
    }
}