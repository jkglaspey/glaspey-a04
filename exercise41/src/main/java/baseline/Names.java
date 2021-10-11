/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Names {

    //create output formatter for each instance
    private final Formatter out;

    //create input reader for each instance
    private final Scanner in;

    //create list for each instance
    //we can keep the last names and first names combined since we will never print it differently
    private final List<String> listOfNames;

    //create constructor to initialize list
    public Names(String inputFile, String outputFile) {
        //initialize list
        listOfNames = new ArrayList<>();

        //open file streams
        in = openInputFile(inputFile);
        out = openOutputFile(outputFile);

        //store names in list
        readNamesFromFile();
    }

    //create default constructor
    public Names() {
        listOfNames = new ArrayList<>();
        in = new Scanner(System.in);
        out = new Formatter();
    }

    //create method to get a name from the list
    public String getName(int position) {
        return listOfNames.get(position);
    }

    //create method to initialize the input stream
    private Scanner openInputFile(String file) {
        //try to create input stream from exercise41_input.txt
        try {
            return new Scanner(new File(file));
        }
        //catch FileNotFoundException
        catch (FileNotFoundException fileNotFoundException) {
            System.err.print("Error opening file. ");
            System.exit(1);
        }
        //fail case (never accessed)
        return new Scanner(System.in);
    }

    //create method to initialize the output stream
    private Formatter openOutputFile(String file) {
        //try to create output stream to exercise41_output.txt
        try {
            return new Formatter(file);
        }
        //catch SecurityException
        catch (SecurityException securityException) {
            System.err.print("You do not have write access to this file. ");
            System.exit(1);
        }
        //catch FileNotFoundException
        catch (FileNotFoundException fileNotFoundException) {
            System.err.print("Error opening or creating file. ");
            System.exit(1);
        }
        //fail case (never accessed)
        return new Formatter();
    }

    //create method to add a name to the list
    private void addNameToList(String name) {
        //add the name to the end of the list
        listOfNames.add(name);
    }

    //create method to read the next line from the file
    private String getNameFromFile() {
        //return the next line from the file
        return in.nextLine();
    }

    //create method to loop through the file and store all names in the list
    private void readNamesFromFile() {
        //loop while input has nextLine
        while (in.hasNext()) {
            try {
                //get the string for the next name
                //add name to list
                addNameToList(getNameFromFile());
            }
            //catch NoSuchElementException
            catch (NoSuchElementException elementException) {
                System.err.print("Invalid input. ");
                return;
            }
            //catch IllegalStateException
            catch (IllegalStateException stateException) {
                System.err.print("Error reading from file. ");
                return;
            }
        }
    }

    //create method to sort the list
    public void sortListAlphabetically() {
        //utilize the ArrayList sort() method to sort by last name
        Collections.sort(listOfNames);
    }

    //create method to print list of names to output file
    //precondition: output stream has been initialized
    public void printNamesToFile() {
        //print heading
        out.format("Total of %d names%n--------------------------%n",listOfNames.size());

        //loop for size of listOfNames
        for (String name : listOfNames) {
            //print in output file each name
            try {
                out.format("%s%n", name);
            }
            //catch FormatterClosedException
            catch (FormatterClosedException formatterClosedException) {
                System.err.print("Error writing to file. ");
                return;
            }
        }
        closeFiles();
    }

    //create method to close the input and output files
    private void closeFiles() {
        //close input file
        if (in != null) in.close();

        //close output file
        if (out != null) out.close();
    }
}
