package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NamesTest extends Names {
    //create class test object
    Names test;

    //initialize the object for each test
    @BeforeEach
    void test_initName() {
        //create new Names object using files
        test = new Names("./data/exercise41_input.txt","./data/exercise41_output.txt");
    }

    //test the constructor
    //this also tests the getName() method
    @Test
    void test_Names() {
        //test that the names were read in correctly
        //this also verifies the input stream was created correctly
        assertEquals("Ling, Mai",test.getName(0));
        assertEquals("Xiong, Fong",test.getName(6));
    }

    //test the sorting method
    @Test
    void test_sortNamesAlphabetically() {
        //sort the list
        test.sortListAlphabetically();

        //test that the first and last values are the correctly sorted strings
        assertEquals("Johnson, Jim",test.getName(0));
        assertEquals("Zarnecki, Sabrina",test.getName(6));
    }

    //test that the output was printed to the file correctly
    @Test
    void test_printNamesToFile() throws FileNotFoundException {
        //print unsorted list to output file
        test.printNamesToFile();

        //create new input stream
        Scanner inTest = new Scanner(new File("./data/exercise41_input.txt"));

        //test that the data is in the file
        //pointer should start at the names
        //testing the existence of one name confirms the existence of the rest
        String testString = inTest.nextLine();
        assertEquals("Ling, Mai",testString);

        //close input
        inTest.close();
    }
}