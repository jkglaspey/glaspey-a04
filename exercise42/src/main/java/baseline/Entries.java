/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Entries {

    //create output reader
    private final Formatter out;

    //create input reader for each instance
    private final Scanner in;

    //create list of lists to store input
    private final List<List<String>> data;

    //create constructor to initialize list
    public Entries(String inputFile, String outputFile) {
        //initialize list
        data = new ArrayList<>();

        //open file streams
        in = openInputFile(inputFile);
        out = openOutputFile(outputFile);

        //store entries in list
        readFile();
    }

    //create method to get a specific entry from the list
    public List<String> getEntry(int position) {
        //get the entry using arraylist get method
    }

    //create method to get a first name
    public String getFirstName(int position) {
        //return the 2nd value of the list at this position
    }

    //create method to get a last name
    public String getLastName(int position) {
        //return the 1st value of the list at this position
    }

    //create a method to get a salary
    public String getSalary(int position) {
        //return the salary of the list at this position
    }

    //create method to initialize the input stream (called by constructor)
    private Scanner openInputFile(String file) {
        //try to create input stream
        //catch FileNotFoundException
    }

    //create method to initialize the output stream (called by constructor)
    private Formatter openOutputFile(String file) {
        //try to create output stream
        //catch SecurityException
        //catch FileNotFoundException
    }

    //create method to add an entry to the list
    private void addEntryToList(String firstName, String lastName, String salary) {
        //add the entry to the end of the list using arraylist's add() method
    }

    //create method to read the next line from the file
    private String getEntryFromFile() {
        //return the next line from the file
    }

    //create method to loop through the file and store all entries in the list
    private void readFile() {
        //loop while input has nextLine
        //get the string for the next entry
        //create an array to store 3 Strings separated by "," using String's split() method.
        //add entry to list using array
        //catch NoSuchElementException
        //catch IllegalStateException
        }
    }

    //create method to print list of entries to output file
    //precondition: output stream has been initialized
    public void printEntriesToFile() {
        //print heading
        //loop for size of data
        //print in output file each entry
        //catch FormatterClosedException
        //close streams
    }

    //create method to close the input and output files of an instance
    private void closeFiles() {
        //close input file if not null
        //close output file if not null
    }
}
