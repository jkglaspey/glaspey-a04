/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Joshua Glaspey
 */

// The purpose of this class is to maintain a list of words that appear from a file.

package baseline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyCounter {

    // Create instance variable to store words as a list
    private final List<Word> listOfWords;

    // Create constructor to initialize list
    public FrequencyCounter() {
        // initialize listOfWords as an ArrayList<>
        listOfWords = new ArrayList<>();
    }

    // Create method to get the list of words
    public List<Word> getListOfWords() { return listOfWords; }

    // Create method to oversee the process of running through a string of words and adding them to the list.
    public void countWordOccurrencesInString(String s) {
        // create array of Strings using String split() method
        String[] wordsInString = s.split(" ");

        // loop through the array
        for(String word : wordsInString) {
            // find word index
            int location = findWordInList(word);

            // if the word is in the list, add 1 to frequency
            if(location >= 0) listOfWords.get(location).foundWord();

            // otherwise, add it to the list
            else listOfWords.add(new Word(word));
        }
    }

    // Create method to determine if a word already exists in the list
    private int findWordInList(String word) {
        // loop through list
        for(int i = 0; i < listOfWords.size(); i++) {
            // if word is found using getWord(), return index
            if(listOfWords.get(i).getMyWord().equalsIgnoreCase(word)) return i;
        }

        // else return -1
        return -1;
    }

    // Create method to sort the list of words by occurrences
    public void sortListOfWords() {
        // utilize arraylist sort() method
        // I overrode it in Word class
        Collections.sort(listOfWords);
    }

    // Create method to get the length of the longest word in the list
    private int getLengthOfLongestWord() {
        // declare a length
        int length = 0;

        // loop through list
        for(Word w : listOfWords) {
            // if current word is longer than length, override length
            if(w.getMyWord().length() > length) length = w.getMyWord().length();
        }

        // return the longest length
        return length;
    }

    // Create method to get the amount of white space needed to match the formatting for a histogram
    private String getWhiteSpace(Word w, int length) {
        // declare string to append totalSpace amount of spaces to
        StringBuilder whiteSpace = new StringBuilder();
        int totalSpace = length - w.getMyWord().length();

        // add totalSpaces number of spaces to the string
        whiteSpace.append(" ".repeat(Math.max(0, totalSpace)));

        // return a string of spaces
        return whiteSpace.toString();
    }

    // Create method to print the list of words
    public void printListOfWords() {
        // get length of the longest word
        int length = getLengthOfLongestWord();

        // loop through list
        for(Word w : listOfWords) {
            // print the word with an appropriate amount of white space for formatting
            System.out.printf("%s:%s ",w.getMyWord(),getWhiteSpace(w,length));

            // loop for frequency of word and print asterisks
            for(int i = 0; i < w.getCount(); i++) {
                System.out.print("*");
            }

            // print a new line for next word
            System.out.print("\n");
        }
    }
}
