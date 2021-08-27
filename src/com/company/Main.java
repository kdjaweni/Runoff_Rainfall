package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        double length, width, rainfall, runoff;

        Scanner keyboard = new Scanner(System.in);// Import the scanner to get user input//
        System.out.println("What is the length of the roof : "); // Ask the user for the length//
        length = keyboard.nextDouble();                            // Get the value from the user
        System.out.println("What is the width of the roof : ");  // Ask the user for the width//
        width = keyboard.nextDouble();                           // Ger the value from the user
        System.out.println("How many inches of rain have fallen : ");// Ask the user for the rain value//
        rainfall = keyboard.nextDouble();                              // Get the value from the user//
        runoff = (length*width*rainfall);                               // Calculate the runoff//
        System.out.println( "The runoff in inches is : " + runoff + " cubic inches");// Print out the result in cubic inches//
        System.out.println( "The runoff in gallons is : " + (runoff/231) + " gallons");// Print out the result in gallons//

    }
}
