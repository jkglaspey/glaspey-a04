/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

/*
Create a program that reads in a file named `exercise46_input.txt` and counts the frequency of words in the file. Then
construct a histogram displaying the words and the frequency, and display the histogram to the screen.
 */

// The purpose of this class is to run a main method which calls the other classes in this package.
// It will oversee the process of scanning through an input file and creating a histogram of the number of word
// occurrences in that file.

package baseline;

public class Solution46 {

    public static void main(String[] args) {
        // Create new DataInputReader to read input from file
        DataInputReader input = new DataInputReader("./data/exercise46_input.txt");

        // Create a new frequency counter
        FrequencyCounter list = new FrequencyCounter();

        // Loop while there is still lines in file
        while(input.hasNextLine()) {
            // Add word occurrences to list
            list.countWordOccurrencesInString(input.getNextLine());
        }

        // Close the input stream
        input.closeStream();

        // Sort the list of words
        list.sortListOfWords();

        // Print the histogram of words to the user
        list.printListOfWords();
    }


}
