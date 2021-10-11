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

    //create method to get a first name
    public String getFirstName(int position) {
        //return the 2nd value of the list at this position
        return data.get(position).get(1);
    }

    //create method to get a last name
    public String getLastName(int position) {
        //return the 1st value of the list at this position
        return data.get(position).get(0);
    }

    //create a method to get a salary
    public String getSalary(int position) {
        //return the 3rd value of the list at this position
        return data.get(position).get(2);
    }

    //create method to initialize the input stream (called by constructor)
    private Scanner openInputFile(String file) {
        //try to create input stream
        try {
            return new Scanner(new File(file));
        }
        //catch FileNotFoundException
        catch (FileNotFoundException fileNotFoundException) {
            System.err.print("File not found.");
            System.exit(1);
        }
        //fail case
        return new Scanner(System.in);
    }

    //create method to initialize the output stream (called by constructor)
    private Formatter openOutputFile(String file) {
        //try to create output stream
        try {
            return new Formatter(file);
        }
        //catch FileNotFoundException
        catch (FileNotFoundException fileNotFoundException) {
            System.err.print("File not found.");
            System.exit(1);
        }
        //catch SecurityException
        catch (SecurityException securityException) {
            System.err.print("Lacking permissions to create/open file.");
            System.exit(1);
        }
        //fail case
        return new Formatter();
    }

    //create method to add an entry to the list
    private void addEntryToList(String[] values) {
        //add the entry to the end of the list using arraylist's add() method
        data.add(new ArrayList<>(Arrays.asList(values[0],values[1],values[2])));
    }

    //create method to read the next line from the file
    private String getEntryFromFile() {
        //return the next line from the file
        return in.nextLine();
    }

    //create method to loop through the file and store all entries in the list
    private void readFile() {
        //loop while input has next
        while(in.hasNext()) {
            try {
                //get the string for the next entry
                String entryLine = getEntryFromFile();

                //create an array to store 3 Strings separated by "," using String's split() method.
                String[] entries = entryLine.split(",");

                //add entry to list using array
                addEntryToList(entries);
            }
            //catch NoSuchElementException
            catch (NoSuchElementException elementException) {
                System.err.print("Invalid input.");
                return;
            }
            //catch IllegalStateException
            catch (IllegalStateException stateException) {
                System.err.print("Error reading from file.");
                return;
            }
        }
    }

    //create method to print list of entries to output file
    //precondition: output stream has been initialized
    public void printEntriesToFile() {
        //print heading
        out.format("%-10s%-10s%-10s%n------------------------------%n","Last","First","Salary");

        //loop for size of data
        for(int i = 0; i < data.size(); i++) {
            try {
                //print in output file each entry
                out.format("%-10s%-10s%-10s%n",getLastName(i),getFirstName(i),getSalary(i));
            }
            //catch FormatterClosedException
            catch (FormatterClosedException formatterClosedException) {
                System.err.print("Error writing to file.");
                return;
            }
        }
        //close streams
        closeFiles();
    }

    //create method to close the input and output files of an instance
    private void closeFiles() {
        //close input file if not null
        if(in != null) in.close();

        //close output file if not null
        if(out != null) out.close();
    }
}
