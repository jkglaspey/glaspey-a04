/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class reads in data from a json file and utilizes Google's JSON parser to create Product objects

package baseline;

import com.google.gson.JsonStreamParser;

public class ProductMakerFromJson {

    // create instance variables for file path and stream parser
    private final String path;
    private JsonStreamParser jsonStream;

    // create constructor to initialize the stream from the file path
    public ProductMakerFromJson(String path) {
        // initialize path
        // call createJsonReader
    }

    // create method to initialize the stream
    // will be called by the constructor
    private void createJsonReader() {
        // try to open a new input reader stream from the file path
        // catch if the file could not be located
    }

    // create method to determine if there is another product in the json file
    public boolean hasUnreadProduct() {
        // return the hasNext method from InputStream
        return jsonStream.hasNext();
    }

    // create method to grab the next product from the json file
    public Product getNextProduct() {
        // create new Gson object to allow us to grab object from the file
        // create new Json element from stream position
        // if the object exists, return the Product which will be parsed from the stream
        // catch if we grab a null element
    }
}
