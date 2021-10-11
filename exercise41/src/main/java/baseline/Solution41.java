/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

/*
Create a program that reads in the following list of names from a file called 'exercise41_input.txt' and sorts the list
alphabetically. Then print the sorted list to a file called 'exercise41_output.txt'.
 */

package baseline;

public class Solution41 extends Names {

    public static void main(String[] args) {

        //create new list of names from input file
        Names listOfNames = new Names("./data/exercise41_input.txt","./data/exercise41_output.txt");

        //sort the list of names
        listOfNames.sortListAlphabetically();

        //print the results to the output file
        //this method calls for the streams to be closed
        listOfNames.printNamesToFile();
    }
}
