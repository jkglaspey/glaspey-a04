/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class reads in user input to return values necessary to generate an index.html file.
// For the case of Exercise43, we will only be using standard input.
// I created an "input" object as good practice for the circumstance that I would like to create a file reader object.

package baseline;

import java.util.Scanner;

public class InputReader {

    // Create an instance Scanner variable to read input.
    private final Scanner in;

    // Create public constructor with no parameters to initialize the standard input stream.
    public InputReader() {
        // initialize standard input
        in = new Scanner(System.in);
    }

    // Create method to ask the user for the name of the site.
    // Returns the name of the site as a String.
    public String askUserForName() {
        // prompt user to enter a name
        System.out.print("Site name: ");

        // return the next line
        return in.nextLine();
    }

    // Create method to ask the user for the author of the site.
    // Returns the author of the site as a String.
    public String askUserForAuthor() {
        // prompt user to enter an author
        System.out.print("Author: ");

        // return the next line
        return in.nextLine();
    }

    // Create method to ask the user if he/she wants to include JavaScript files.
    // Returns a boolean equivalent for whether the user wants to include JavaScript files.
    public Boolean askIfUserWantsJSFiles() {
        // prompt the user to enter "y" or "n" to include JavaScript files
        System.out.print("Do you want a folder for JavaScript? ");

        //save next letter to local variable
        char input = in.nextLine().charAt(0);

        // return true IF the user entered "y"
        // otherwise return false
        return ( (input == 'y') || (input == 'Y') );
    }

    // Create method to ask the user if he/she wants to include CSS files.
    // Returns a boolean equivalent for whether the user wants to include CSS files.
    public Boolean askIfUserWantsCSSFiles() {
        // prompt the user to enter "y" or "n" to include CSS files
        System.out.print("Do you want a folder for CSS? ");

        //save next letter to local variable
        char input = in.nextLine().charAt(0);

        // return true IF the user entered "y"
        // otherwise return false
        return ( (input == 'y') || (input == 'Y') );
    }

    // Create method to close the input stream
    public void closeFiles() {
        if(in != null) in.close();
    }
}
