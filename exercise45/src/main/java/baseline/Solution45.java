/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

/*
Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize.
Replace each occurrence with use. Write the modified file to a new file.
 */

// The purpose of this class is to oversee the other classes.

package baseline;

public class Solution45 {

    public static void main(String[] args) {

        // Create a File Reader at the file path
        DataInputFile input = new DataInputFile("./data/exercise45_input.txt");

        // Create a UserInput reader to record a new output file name
        UserInput in = new UserInput();

        // Ask user for new file name
        String newFile = in.askUserForFileName();

        // Create a new File Output Writer using the new output file
        DataOutputFile output = new DataOutputFile("./data/" + newFile + ".txt");

        // Loop while input file is not empty
        // get next line from input stream
        // String replace "utilize" with "use"
        // Write line to file
        while(input.hasNextLine()) {
            //System.out.println("Test");
            output.writeToFileAndReplace(input.getNextLine(),"utilize","use");
        }

        // Close file streams
        input.closeFile();
        in.closeFile();
        output.closeFile();
    }
}
