/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to create a Word object and store its frequency. This will be used by the
// FrequencyCounter class.

package baseline;

public class Word implements Comparable<Word> {

    // Create instance variables to store the name of the word and its number of occurrences
    private final String myWord;
    private int count;

    // Create constructor to initialize values
    public Word(String word) {
        // initialize word
        this.myWord = word;

        // set count to 1
        count = 1;
    }

    // Create method to access the word
    public String getMyWord() { return myWord; }

    // Create method to access the count
    public int getCount() { return count; }

    // Create method to increment the count
    public void foundWord() {
        count++;
    }

    // Override the compareTo method, so we can sort arraylist by count
    @Override
    public int compareTo(Word base) {
        // get the parameter word count
        int compareCount = base.getCount();

        // determine if current word occurs more or less frequently than the parameter word
        return compareCount - this.count;
    }

    // Override the equals() method to keep consistency
    @Override
    public boolean equals(Object base) {
        return base == this;
    }

    // Override the hashCode() method to maintain variable uniqueness
    @Override
    public int hashCode() {
        int result = count ^ (count >>> 31); // 31 is an arbitrary prime number
        result = 31 * result + myWord.hashCode();
        return result;
    }
}
