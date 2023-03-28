package hwOtherProgrammes;
/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class P1_ReadingUserInputChallenge {

    public static void main(String[] args) {

        // Declaring variables counter and sum
        int counter = 1;
        int sum = 0;

        //initializing Scanner object
        Scanner scan = new Scanner(System.in);


        //running a while loop for 10 times
        while (counter <= 10) {
            System.out.println("Please enter no. " + counter);

            // inserting if condition where the input should be an integer or it will give error msg.
            if (scan.hasNextInt()) {
                int num = scan.nextInt();
                sum = num + sum;
                counter++;
            } else {
                System.out.println("Invalid Number. Please enter a Valid Number");
                scan.next();
            }
        }
        // final message displaying the sum of the 10 inputs
        System.out.println("Sum of your 10 number's is " + sum);

        // Closing the Scanner object
        scan.close();
    }
}
