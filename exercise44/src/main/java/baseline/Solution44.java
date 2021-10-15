/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

/*
Create a program that takes a product name as input and retrieves the current price and quantity for that product. The
product data is in a data file in the JSON format. Print out the product name, price, and quantity if the product is
found. If no product matches the search, state that no product was found and start over.
 */

// This class uses connections to the other classes to oversee the entire process of:
    // Creating products from a json and storing them in a database
    // Asking the user to enter a valid product and comparing it to the database
    // Printing the found product

package baseline;

public class Solution44 {

    public static void main(String[] args) {

        // create new json manager
        ProductMakerFromJson json = new ProductMakerFromJson("data/exercise44_input.json")

        // create database to store products
        ProductDatabase listOfProducts = new ProductDatabase();

        // loop through json and add products to list
        while(json.hasUnreadProduct()) {
            // add new product to list
            listOfProducts.addProductToList(json.getNextProduct());
        }

        // create new UserInputReader to find products
        UserInputReader userReader = new UserInputReader();

        // get a product from the user, and save the position in the database
        userReader.askUserForProduct();

        // print the saved product
        listOfProducts.printCurrentProduct();

        // close input stream
        userReader.closeFile();
    }
}
