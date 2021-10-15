/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class creates a standard input stream and gets a valid product name from the user.

package baseline;

import java.util.Scanner;

public class UserInputReader extends ProductDatabase {

    // create instance scanner stream for system input
    private final Scanner in;

    // create public constructor
    public UserInputReader() {
        // initialize input stream
        in = new Scanner(System.in);
    }

    // create method to ask the user for a product name and return the string
    public void askUserForProduct() {
        // loop until we break
        // prompt user to enter name
        // call ProductDatabase method to validate that the product exists
        // if true, break
        // else loop again
    }

    // create method to close input stream
    public void closeFile() {
        // if Scanner is not null, close it
    }
}
