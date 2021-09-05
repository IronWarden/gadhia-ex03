/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*

Exercise 3 - Printing Quotes
Quotation marks are often used to denote the start and end of a string.
But sometimes we need to print out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author.
Display the quotation and author as shown in the example output.

Example Output
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."
Constraints
Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
If your language supports string interpolation or string substitution, don’t use it for this exercise.
 Use string concatenation instead.
e.g. use println() instead of printf()
 */

import java.util.*;
public class Solution03 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // prompt user for the quote and scan the input
            System.out.print("What is the quote?");

            // s1 has to be put into quotes before concatenating
            String s1 = "\"" + in.nextLine() + "\"";
            System.out.println("Who said it?");
            String s2 = in.nextLine();

            // Concatenate the two string, s2 goes before s1 with the string 'says'

            String s3 = s2 + " " + "says," + "" + s1;

            // output
            System.out.println(s3);
    }

}
