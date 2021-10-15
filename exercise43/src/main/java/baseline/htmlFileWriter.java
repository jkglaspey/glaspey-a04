/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class generates an index.html file that contains the name of the site inside the <title> tag and the author in a
// <meta> tag.

package baseline;

import java.io.BufferedWriter;
import java.io.File;

public class htmlFileWriter {

    // Create instance String variables for name and author.
    private String name;
    private String author;

    // Create instance Boolean variables to decide creating folders for JS and CSS files.
    private boolean hasJSFiles;
    private boolean hasCSSFiles;

    // Create instance file streams.
    private File websiteDirectory;
    private File JSDirectory;
    private File CSSDirectory;
    private File htmlFile;

    // Create instance BufferedWriter stream to write data to html file.
    private BufferedWriter out;

    // Create constructor to store data.
    // This will also create the new website directory, as well as add the directories for JS and CSS files if
    // specified.
    public htmlFileWriter(String name, String author, boolean hasJSFiles, boolean hasCSSFiles) {
        // initialize variables
        this.name = name;
        this.author = author;
        this.hasJSFiles = hasJSFiles;
        this.hasCSSFiles = hasCSSFiles;

        // create directory
        generateWebsiteDirectory();

        //use boolean values to decide on creating extra directories
        if(this.hasJSFiles) generateJSFilesDirectory();
        if(this.hasCSSFiles) generateCSSFilesDirectory();
    }

    // Create default constructor
    public htmlFileWriter() {
        // names are not initialized; variables will be set through set method.
        // set two boolean values to false.
    }

    // Create method to create a base website directory using the website name
    // Precondition: Website name has been set.
    private void generateWebsiteDirectory() {
        // create new directory using File object
        // verify the directory was created successfully
        // print that directory was created
        // if error, print that there was an internal error
    }

    // Create method to create a directory inside the website directory for JavaScript files
    // Precondition: generateWebsiteDirectory() was run already
    private void generateJSFilesDirectory() {
        // create new directory inside website directory using File object
        // verify the directory was created successfully
        // print that directory was created
        // if error, print that there was an internal error
    }

    // Create method to create a directory inside the website directory for CSS files
    // Precondition: generateWebsiteDirectory() was run already
    private void generateCSSFilesDirectory() {
        // create new directory inside website directory using File object
        // verify the directory was created successfully
        // print that directory was created
        // if error, print that there was an internal error
    }

    // Create method to create a html file
    // Precondition: Website name and author name have been set
    public void generateHTMLFile() {
        // create new html file using File object
        // verify the directory was created correctly
        // print that the file was created
        // if everything passes, call writeDataToHTMLFile() method. This way it won't try to write data to a
        // nonexistent file.
        // if error, print that there was a file creation error
    }

    // Create method to write data to html file
    // Precondition: generateHTMLFile has been run before
    private void writeDataToHTMLFile() {
        // try to create a new bufferwriter object using the html file path
        // if successful, write data to html file
        // specifically, utilizing .write to assign the name to the <title> tag and the author to the <meta> tag
        // if still successful, print that everything was written.
        // catch Java.io.File exception "IOException"
    }

    // Create method to close file streams
    public void closeFiles() {
        // for each File object:
        // if it's not null, close it
        // --> also do this to BufferedWriter object.
    }
}
