/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to maintain a list of words that appear from a file.

package baseline;

import java.util.List;

public class FrequencyCounter {

    // Create instance variable to store words as a list
    List<Word> listOfWords;

    // Create constructor to initialize list
    public FrequencyCounter() {
        // initialize listOfWords as an ArrayList<>
    }

    // Create method to oversee the process of running through a string of words and adding them to the list.
    public void countWordOccurrencesInString(String s) {
        // create array of Strings using String split() method
        // loop through the array
            // if the word is in the list, add 1 to frequency
            // otherwise add it to the list
    }

    // Create method to determine if a word is already existent in the list
    private boolean isWordInList(String word) {
        // loop through list
            // if word is found using getWord(), return true
        // else return false
    }

    // Create method to sort the list of words by occurrences
    public void sortListOfWords() {
        // utilize arraylist sort() method
        // we overrode it in Word class
    }

    // Create method to print the list of words
    public void printListOfWords() {
        // loop through list
        // print each word using ArrayList toString()
        // we overrode it in Word class
    }
}
