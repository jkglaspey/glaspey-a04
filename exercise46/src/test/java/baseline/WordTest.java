package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    // create test word
    Word test;
    @BeforeEach
    void init_Word() {
        test = new Word("test");
    }

    // test the method that returns the string of the word
    @Test
    void getMyWord() {
        assertEquals("test",test.getMyWord());
    }

    // test the method that returns the count of the word
    @Test
    void getCount() {
        assertEquals(1,test.getCount());
    }

    // test the method that increments a word once its found
    @Test
    void foundWord() {
        test.foundWord();
        assertEquals(2,test.getCount());
    }

    // test the method that compares two word counts to each other
    @Test
    void compareTo() {
        // create new word to test
        Word test2 = new Word("test2");

        // assert they have the same count
        assertEquals(0,test.compareTo(test2));

        // increment test2
        test2.foundWord();

        // assert they are not the same
        assertEquals(1,test.compareTo(test2));
    }
}