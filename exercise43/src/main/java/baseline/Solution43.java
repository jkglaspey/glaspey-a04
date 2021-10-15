/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

/*
Create a program that generates a website skeleton
 */

package baseline;

public class Solution43 {

    public static void main(String[] args) {

        // Create new object to read user input
        InputReader in = new InputReader();

        // Prompt for the name of the site.
        // Save it as a local String variable
        String name = in.askUserForName();

        // Prompt for the author of the site.
        // Save it as a local String variable.
        String author = in.askUserForAuthor();

        // Ask if the user wants a folder for JavaScript files.
        // Save it as a local boolean variable.
        boolean hasJSFiles = in.askIfUserWantsJSFiles();

        // Ask if the user wants a folder for CSS files.
        // Save it as a local boolean variable.
        boolean hasCSSFiles = in.askIfUserWantsCSSFiles();

        // Create new htmlFileWriter object using the local variables.
        // This will create a new website directory inside the project.
        HTMLFileWriter out = new HTMLFileWriter(name,author,hasJSFiles,hasCSSFiles);

        // close the streams
        in.closeFiles();
        out.closeFiles();
    }
}
