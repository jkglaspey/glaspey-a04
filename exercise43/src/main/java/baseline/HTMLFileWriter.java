/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class generates an index.html file that contains the name of the site inside the <title> tag and the author in a
// <meta> tag.

package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLFileWriter {

    // Create instance String variables for name and author.
    private final String name;
    private final String author;

    // Create instance value to store html file since it will be called by more than 1 method
    private File htmlFile;

    // Create instance BufferedWriter stream to write data to html file.
    private BufferedWriter out;

    // Create class variables to represent strings in directory / file creation
    private static final String PATH = "./data/website/";
    private static final String INDEX = "/index.html";
    private static final String FORMAT = "Created %s%s%s%n";

    // Create constructor to store data.
    // This will also create the new website directory, as well as add the directories for JS and CSS files if
    // specified.
    public HTMLFileWriter(String name, String author, boolean hasJSFiles, boolean hasCSSFiles) {
        // initialize variables
        this.name = name;
        this.author = author;

        // create directory
        generateWebsiteDirectory();

        // create html file
        generateHTMLFile();

        //use boolean values to decide on creating extra directories
        if(hasJSFiles) generateJSFilesDirectory();
        if(hasCSSFiles) generateCSSFilesDirectory();
    }

    // Create method to create a base website directory using the website name
    // Precondition: Website name has been set.
    private void generateWebsiteDirectory() {
        // create new directory using File object
        File websiteDirectory = new File(PATH + name);

        // create directory from file object
        if(websiteDirectory.mkdirs()) {
            // verify the directory was created successfully
            if(websiteDirectory.isDirectory()) {
                // print that directory was created
                System.out.printf("Created %s%s%n",PATH,name);
            }
            // if error, print that there was an internal error
            else System.out.print("Error creating directory. \n");
        }
    }

    // Create method to create a directory inside the website directory for JavaScript files
    // Precondition: generateWebsiteDirectory() was run already
    private void generateJSFilesDirectory() {
        // create new directory inside website directory using File object
        File jsDirectory = new File(PATH + name + "/js");

        // create directory from file object
        if(jsDirectory.mkdirs()) {
            // verify the directory was created successfully
            if(jsDirectory.isDirectory()) {
                // print that directory was created
                System.out.printf(FORMAT, PATH,name,"/js/");
            }
            // if error, print that there was an internal error
            else System.out.print("Error creating JS directory. \n");
        }
    }

    // Create method to create a directory inside the website directory for CSS files
    // Precondition: generateWebsiteDirectory() was run already
    private void generateCSSFilesDirectory() {
        // create new directory inside website directory using File object
        File cssDirectory = new File(PATH + name + "/css");

        // create directory from file object
        if(cssDirectory.mkdirs()) {
            // verify the directory was created successfully
            if(cssDirectory.isDirectory()) {
                // print that directory was created
                System.out.printf(FORMAT, PATH,name,"/css/");
            }
            // if error, print that there was an internal error
            else System.out.print("Error creating CSS directory. \n");
        }
    }

    // Create method to create a html file
    // Precondition: Website name and author name have been set
    private void generateHTMLFile() {
        // create new html file using File object
        htmlFile = new File(PATH + name + INDEX);

        // create file from file object
        try {
            if(htmlFile.createNewFile()) {
                // verify the directory was created correctly
                if(htmlFile.isFile()) {
                    // Call writeDataToHTMLFile() method. This way it won't try to write data to  nonexistent file.
                    writeDataToHTMLFile();
                }

                // if error, print that there was a file creation error
                else System.out.print("Error creating html file. \n");
            }
        }
        // catch issue with creating html file
        catch (IOException e) {
            System.out.print("Error creating html file. \n");
        }
    }

    // Create method to write data to html file
    // Precondition: generateHTMLFile has been run before
    private void writeDataToHTMLFile() {
        // try to create a new BufferWriter object using the html file path
        try {
            out = new BufferedWriter(new FileWriter(htmlFile));

            // if successful, write data to html file
            // specifically, utilizing .write to assign the name to the <title> tag and the author to the <meta> tag
            out.write("<!DOCTYPE html>\n<html>\n" +
                    "<head><title>" + name +
                    "\n</title></head>\n" +
                    "<meta>" + author + "\n" +
                    "</html>");

            // print success in system output
            System.out.printf(FORMAT, PATH,name,INDEX);

            //close the writer stream
            closeFiles();
        }
        // catch Java.io.File exception "IOException"
        catch (IOException ioException) {
            System.out.print("Error writing to file.\n");
        }
    }

    // Create method to close file streams
    private void closeFiles() {

        // if the stream is not null, close it
        if(out != null) {
            try {
                out.close();
            }
            // file throws an exception
            catch (IOException e) {
                System.out.print("Error writing to file.\n");
            }
        }
    }
}
