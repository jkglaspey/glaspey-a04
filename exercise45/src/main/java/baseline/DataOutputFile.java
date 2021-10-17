/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to write Strings to an output file, as well as use a "find and replace" to replace
// specific word occurrences in those Strings.

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

public class DataOutputFile {

    // Create instance variables for output file and output stream
    private final File outputFile;
    private Formatter outputStream;

    // Create constructor to initialize the output file and the output stream
    public DataOutputFile(String path) {
        // initialize the output file
        outputFile = createOutputFile(path);

        // create a new file from the file object
        try {
            if(outputFile.createNewFile()) {
                outputStream = createOutputStream();
            }
            // file already exists
            else {
                System.out.print("File already exists.");
                System.exit(1);
            }
        }
        // catch exception with creating new file
        catch (IOException e) {
            System.err.print("Error creating file.");
            System.exit(1);
        }
    }

    // Create method to return a new file from a path
    private File createOutputFile(String path) {
        // return a new file at the file location
        return new File(path);
    }

    // Create method to return a new formatter stream
    private Formatter createOutputStream() {
        // return a new formatter using file
        try {
            return new Formatter(outputFile);
        }
        // catch file not found error
        catch(FileNotFoundException e) {
            System.err.print("Error opening new file.");
            System.exit(1);
        }

        // return empty formatter (for SonarLint)
        return new Formatter();
    }

    // Create method to return the file
    public File getOutputFile() {
        return outputFile;
    }

    // Create method to return the stream
    public Formatter getOutputStream() {
        return outputStream;
    }

    // Create method to write a string to the output file
    public void writeToFileAndReplace(String s, String contains, String replace) {
        // create new string using replaceOccurrencesInString method
        // write string to file
        outputStream.format("%s%n",replaceOccurrencesInString(s,contains,replace));
    }

    // Create method to replace occurrences of a string inside another string
    private String replaceOccurrencesInString(String s, String contains, String replace) {
        return s.replaceAll(contains,replace);
    }

    // Create method to close the output stream
    public void closeFile() {
        // if stream is not null, close stream
        if(outputStream != null) outputStream.close();
    }
}
