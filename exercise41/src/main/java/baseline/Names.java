/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Names {

    //create class output (we will be modifying one file)
    private static Formatter output;

    //create input reader for each instance
    private Scanner in;

    //create list for each instance
    //we can keep the last names and first names combined since we will never print it differently
    private List<String> listOfNames;

    //create constructor to initialize list
    public Names(String file) {
        //initialize list
        //set input stream to be of the String "file"
        //add names to list using readNamesFromFile()
    }

    //create default constructor
    public Names() {
        //initialize list
    }

    //create method to initialize the output stream
    public static void openFile() {
        //try to create output stream to exercise41_output.txt
        //catch SecurityException
        //catch FileNotFoundException
    }

    //create method to add a name to the list
    private void addNameToList(String name) {
        //add the name to the end of the list
    }

    //create method to sort the list
    public void sortListAlphabetically() {
        //utilize the ArrayList sort() method to sort by last name
    }

    //create method to read the next line from the file
    private String getNameFromFile() {
        //return the next line from the file
    }

    //create method to loop through the file and store all names in the list
    private void readNamesFromFile() {
        //loop while input has nextLine
        //get the string for the next name
        //add name to list
        //catch NoSuchElementException
        //catch IllegalStateException
    }

    //create method to print list of names to output file
    //precondition: output stream has been initialized
    public void printNamesToFile() {
        //loop for size of listOfNames
        //print in output file each name
        //catch FormatterClosedException
    }

    //create method to close the file
    public static void closeFile() {
        //close output as long as it is not null
    }
}
