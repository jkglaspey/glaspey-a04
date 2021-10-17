/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to create a Word object and store its frequency. This will be used by the
// FrequencyCounter class.

package baseline;

public class Word implements Comparable<Word> {

    // Create instance variables to store the name of the word and its number of occurrences
    private String word;
    private int count;

    // Create constructor to initialize values
    public Word(String word) {
        // initialize word
        // set count to 1
    }

    // Create method to access the word
    public String getWord() { return word; }

    // Create method to access the count
    public int getCount() { return count; }

    // Create method to increment the count
    public void foundWord() {
        // increment the count
    }

    // Override the compareTo method, so we can sort arraylist by count
    @Override
    public int compareTo(Word base) {
        // get the parameter word count
        // determine if current word occurs more or less frequently than the parameter word
    }

    // Override the toString() method to make printing on the histogram easier
    @Override
    public String toString() {
        // begin the word by appending ": " to the end
        // loop for its frequency
        // add asterisks to end of word
        // return the word with a newline at the end
    }
}
