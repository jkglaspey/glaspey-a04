/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// This class stores multiple products in an inventory.
// It also holds a reference to a specific product which can be printed to the user.

package baseline;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase extends Product {

    // create list to hold products
    private List<Product> listOfProducts;

    // create int to store product being viewed
    private int currentProductPosition;

    // create constructor to initialize values
    public ProductDatabase() {
        // initialize arraylist
        // set position to 0
    }

    // create method to add a product to the list
    public void addProductToList(Product p) {
        // utilize ArrayList .add()
    }

    // create method to return a boolean if it finds a product in the list
    // it will also change the currentProductPosition to that location
    public boolean findProductInList(String name) {
        // iterate through the arrayList
        // if the instance name matches the parameter name:
            // set currentProductPosition to this position
            // return true
        // else return false
    }

    // create method to print the product at the current position
    public void printCurrentProduct() {
        // print the name
        // print the price
        // print the quantity
    }
}
