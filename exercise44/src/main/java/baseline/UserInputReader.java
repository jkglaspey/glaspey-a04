/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class creates a standard input stream and gets a valid product name from the user.

package baseline;

import java.util.Scanner;

public class UserInputReader {

    // create instance scanner stream for system input
    private final Scanner in;

    // create public constructor
    public UserInputReader() {
        // initialize input stream
        in = new Scanner(System.in);
    }

    // create method to ask the user for a product name and return the string
    public void askUserForProduct(ProductDatabase database) {
        // loop to verify the input is valid
        while(true) {
            // prompt user to enter name
            System.out.print("What is the product name? ");

            // call ProductDatabase method to validate that the product exists
            // if true, break
            if(database.findProductInList(in.nextLine())) break;

            // else loop again
            else System.out.print("Sorry, that product was not found in our inventory.\n");
        }
    }

    // create method to close input stream
    public void closeFile() {
        // If we're calling this method, that means the scanner is not null. Therefore, we do not need to check.
        in.close();
    }
}
