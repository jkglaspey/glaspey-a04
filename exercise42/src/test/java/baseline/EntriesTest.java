package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class EntriesTest {

    //declare new Entries
    private Entries test;

    //initialize Entries for testing methods
    @BeforeEach
    void init_Entries() {
        test = new Entries("./data/exercise42_input.txt","./data/exercise42_output.txt");
    }

    //test constructor
    @Test
    void test_Entries() {
        //test that the names were read in correctly
        //this also verifies the input stream was created correctly
        assertEquals("Ling",test.getLastName(0));
        assertEquals("Mai",test.getFirstName(0));
        assertEquals("55900",test.getSalary(0));
        assertEquals("Zarnecki",test.getLastName(6));
        assertEquals("Sabrina",test.getFirstName(6));
        assertEquals("51500",test.getSalary(6));
    }

    //test the method that gets a first name
    @Test
    void test_getFirstName() {
        assertEquals("Aaron",test.getFirstName(2));
    }

    //test the method that gets a last name
    @Test
    void test_getLastName() {
        assertEquals("Jones",test.getLastName(2));
    }

    //test the method that gets a salary
    @Test
    void test_getSalary() {
        assertEquals("46000",test.getSalary(2));
    }

    //test the method that prints the output to a file
    @Test
    void test_printEntriesToFile() {
        //print list to output file
        test.printEntriesToFile();

        //create new input stream
        Scanner inTest = null;
        try {
            inTest = new Scanner(new File("./data/exercise42_output.txt"));
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.print("File not found.");
        }

        //test that the data is in the file
        //testing the existence of one entry confirms the existence of the rest
        //note: I removed white space for testing
        inTest.nextLine();
        inTest.nextLine();
        String testString = inTest.nextLine();
        assertEquals("LingMai55900",testString.replaceAll("\\s", ""));

        //close input
        inTest.close();
    }
}