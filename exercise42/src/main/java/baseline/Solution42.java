/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

/*
Construct a program that reads in the data from exercise42_input.txt and prints out a table
 */

//note: the output is sent to exercise42_output.txt

package baseline;

public class Solution42 {

    public static void main(String[] args) {

        //create new Entries object using data from input file
        Entries data = new Entries("./data/exercise42_input.txt","./data/exercise42_output.txt");

        //print data to a table
        data.printEntriesToFile();
    }
}
