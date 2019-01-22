package edu.cnm.deepdive;

import java.util.Arrays;

public class CardExtractor {

  // Array of int which cars values will e drawn part of memory

  private static final int[] CARDS = {3, 10, 11, 2, 4, 5, 12, 13, 1, 9, 8, 7, 6};

  /**
   * Apllication entry point.
   *
   * @param args Command-line arguments, specifying start and end positions.
   */

  public static void main(String[] args) {
    int start = Integer.parseInt(args[0]);//Parse element 0 of args (string) as int.
    int end = Integer.parseInt(args[1]);// Parse element 1 of args (string) as int.
    System.out.println(start);// write the value of start to the console
    System.out.println(end); // write the value of end to the console
    int[] extracted = extract(start, end); // Invoke extract to obtain portion of CARDS
    String prettyExtract = Arrays.toString(extracted);// Use Arrays class to get a prettified

    System.out.println(Arrays.toString(extract(start,end))); // Write the prettified version to the console

    //TODO Invoke extract method.

  }

  /**
   * Creates and returns an int[], containing some (or all) of CARDS.
   * @param start starting position (inclusive) of extraction
   * @param end ending position (exclusive) of extraction
   * @return Copy of sub-array of cards
   */

  private static int[] extract(int start, int end) {

    int[] extracted = new int[end - start];// Allocate space for new array of int[].

    for (int i = start; i < end; i += 1) { // Iterate from start (inclusive) to end (exclusive)
      extracted[i - start] = CARDS[i]; // Assign value of CARDS element i to extracted element
    } // for
    return extracted; // Return (place reference to object on stack) extra

  }
}
