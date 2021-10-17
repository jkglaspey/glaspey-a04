/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to read in data from an input file.

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataInputReader {

    // Declare instance variable to maintain a file stream
    private Scanner inputReader;

    // Create constructor to initialize the stream
    public DataInputReader(String path) {
        // create a new Scanner from a new File from file path
    }

    // Create method to determine if there is more words in a file
    public boolean hasNextLine() {
        // return result of Scanner.hasNext()
    }

    // Create method to return the next line from a file
    public String getNextLine() {
        // return result of Scanner.nextLine()
    }

    // Create method to close the input stream
    public void closeStream() {
        // if the stream is not null, close it
    }
}
