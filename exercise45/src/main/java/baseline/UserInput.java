/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to create a Scanner to read user input, which will be used to create an output file
// with a user-specified name.

package baseline;

public class UserInput extends InputManager {

    // Create a constructor to initialize a System.in stream
    public UserInput() {
        super.setInputStreamToSystemIn();
    }

    // Create method to ask user for an output file name
    public String askUserForFileName() {
        // prompt user to enter file name
        System.out.print("Enter name of output file: ");

        // return next line
        return getInputStream().nextLine();
    }
}
