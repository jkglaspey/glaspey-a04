/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class creates the structure of a "Product" object, which will be used to save information from a json file.

package baseline;

public class Product {

    //declare instance variables to store data
    private String name;
    private String price;
    private String quantity;

    // create public constructor to initialize values
    public Product(String name, String price, String quantity) {
        // initialize instance variables
    }

    // create default constructor to initialize null values
    public Product() {
        // set everything to null
    }

    // create method to return the product name
    public String getName() {
        return name;
    }

    // create method to return the product price
    public String getPrice() {
        return price;
    }

    // create method to return the product quantity
    public String getQuantity() {
        return quantity;
    }
}
