package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {

    // create counter for testing
    FrequencyCounter test;
    @BeforeEach
    void init_FrequencyCounter() {
        test = new FrequencyCounter();

        // add values
        test.countWordOccurrencesInString("one two two three three three");
    }

    // test that words are added to the list and updated in frequency
    @Test
    void countWordOccurrencesInString() {
        // test that one was added
        assertEquals("one",test.getListOfWords().get(0).getMyWord());
        assertEquals(1,test.getListOfWords().get(0).getCount());

        // test that two was added
        assertEquals("two",test.getListOfWords().get(1).getMyWord());
        assertEquals(2,test.getListOfWords().get(1).getCount());

        // test that three was added
        assertEquals("three",test.getListOfWords().get(2).getMyWord());
        assertEquals(3,test.getListOfWords().get(2).getCount());
    }

    // test that sorting the list of words sorts them in count order
    @Test
    void sortListOfWords() {
        // sort
        test.sortListOfWords();

        // test that the words were sorted by count
        assertEquals("three",test.getListOfWords().get(0).getMyWord());
        assertEquals("two",test.getListOfWords().get(1).getMyWord());
        assertEquals("one",test.getListOfWords().get(2).getMyWord());
    }

    // test that the method for counting the largest string in the list
    // Note: this only works if you declare getLengthOfLongestWord() as public!

    /*
    @Test
    void getLengthOfLongestWord() {
        assertEquals(5,test.getLengthOfLongestWord());
    }

    // test the method that gets the amount of white space needed to format a histogram correctly
    // Note: this only works if you declare getWhiteSpace() as public!
    //@Test
    void getWhiteSpace() {
        // declare longest length
        int length = 5;

        // test "one"
        assertEquals("  ",test.getWhiteSpace(test.getListOfWords().get(0),length));

        // test "two"
        assertEquals("  ",test.getWhiteSpace(test.getListOfWords().get(1),length));

        // test "three"
        assertEquals("",test.getWhiteSpace(test.getListOfWords().get(2),length));
    }
     */
}