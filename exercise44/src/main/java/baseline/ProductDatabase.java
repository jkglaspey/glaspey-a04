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
    private final List<Product> listOfProducts;

    // create int to store product being viewed
    private int currentProductPosition;

    // create constructor to initialize values
    public ProductDatabase() {
        // initialize arraylist
        listOfProducts = new ArrayList<>();

        // set position to 0
        currentProductPosition = 0;
    }

    // create method to return a specific product at an index value
    // Note: this is solely for testing purposes
    public int getCurrentPosition() { return currentProductPosition; }

    // create method to add a product to the list
    public void addProductToList(Product p) {
        listOfProducts.add(p);
    }

    // create method to return a boolean if it finds a product in the list
    // it will also change the currentProductPosition to that location
    public boolean findProductInList(String name) {
        // iterate through the arrayList
        for(int i = 0; i < listOfProducts.size(); i++) {
            // check if the instance name matches the parameter name
            if(listOfProducts.get(i).getName().equalsIgnoreCase(name)) {
                // set currentProductPosition to this position
                currentProductPosition = i;

                // end method
                return true;
            }
        }
        // else return false
        return false;
    }

    // create method to print the product at the current position
    public void printCurrentProduct() {
        // print the name
        System.out.printf("Name: %s%n",listOfProducts.get(currentProductPosition).getName());

        // print the price
        System.out.printf("Price: %s%n",listOfProducts.get(currentProductPosition).getPrice());

        // print the quantity
        System.out.printf("Quantity: %s%n",listOfProducts.get(currentProductPosition).getQuantity());
    }
}
