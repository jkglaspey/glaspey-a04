/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to read in Strings from an input file.

package baseline;

import java.io.FileNotFoundException;

public class DataInputFile extends InputManager {

    // Create a constructor to initialize a file stream
    public DataInputFile(String path) {
        super(path);

        // create input stream
        try {
            super.setInputStream();
        }
        // catch file not found exception
        catch (FileNotFoundException e) {
            System.err.print("Error locating file.");
            System.exit(1);
        }
    }

    // Create method to determine if the input file has another line
    public boolean hasNextLine() {
        return getInputStream().hasNext();
    }

    // Create method to get the next line from the input file using the input stream
    public String getNextLine() {
        return getInputStream().nextLine();
    }
}
