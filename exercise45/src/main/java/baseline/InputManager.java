/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to create methods for managing a Scanner which will read input. This will be inherited
// by two subclasses.

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputManager {

    // Create instance methods to manage an input file and an input stream
    private File inputFile;
    private Scanner inputStream;

    // Create one-parameter constructor (DataInputFile)
    public InputManager(String path) {
        // initialize file and catch exception
        inputFile = createInputFile(path);
    }

    // Create no parameter constructor (UserInput)
    public InputManager() {}

    // Create method to return a new file from a string path
    private File createInputFile(String path) {
        return new File(path);
    }

    // Create method to create a new Scanner from a file
    public void setInputStream() throws FileNotFoundException {
        inputStream = new Scanner(inputFile);
    }

    // Create method to set the input stream to System.in
    public void setInputStreamToSystemIn() {
        // close the previous stream
        closeFile();

        // create new stream
        inputStream = new Scanner(System.in);
    }

    // Create method to return the input file
    public File getInputFile() {
        return inputFile;
    }

    // Create method to return the input stream
    public Scanner getInputStream() {
        return inputStream;
    }

    // Create method to close the input stream
    public void closeFile() {
        // if stream is not null, close it
        if(inputStream != null) inputStream.close();
    }
}
