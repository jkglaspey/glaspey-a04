/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class reads in data from a json file and utilizes Google's JSON parser to create Product objects

package baseline;

import com.google.gson.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ProductMakerFromJson {

    // create instance variables for file path and json objects
    private final String path;
    private final JsonArray products;

    // create instance count for maintaining JsonArrays
    private int position;

    // create constructor to initialize the stream from the file path
    // use stream to get json values
    // close stream
    public ProductMakerFromJson(String path) {
        // save path
        this.path = path;

        // declare json stream and json array
        JsonStreamParser jsonStream;
        JsonArray productsTemp;

        // try to initialize
        try {
            // create a json stream
            jsonStream = createJsonReader();

            // get jsonArray for each product
            productsTemp = createJsonArray(jsonStream);
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.print("Error reading from file.");
            productsTemp = null;
        }

        // save array values
        products = productsTemp;
        position = 0;
    }

    // create method to initialize the stream
    // will be called by the constructor
    private JsonStreamParser createJsonReader() throws FileNotFoundException {
        // try to open a new input reader stream from the file path
        return new JsonStreamParser(new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8));
    }

    // create method to create an array of json objects containing each product
    private JsonArray createJsonArray(JsonStreamParser jsonStream) {
        // return json array for each product by parsing the stream into an object, then array
        return jsonStream.next().getAsJsonObject().get("products").getAsJsonArray();
    }

    // create method to determine if there's still values left in the arrays (for use by main)
    public boolean hasUnreadProduct() {
        return position < products.size();
    }

    // create method to grab the next product from the json file
    public Product getNextProduct() {
        Product temp = new Product(products.get(position).getAsJsonObject().get("name").getAsString(),
                products.get(position).getAsJsonObject().get("price").getAsString(),
                products.get(position).getAsJsonObject().get("quantity").getAsString());

        // increment position for next use
        position++;

        // return new product
        return temp;
    }
}