package hwOtherProgrammes;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class P2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        //initialising the scanner object
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int num;

        System.out.println("Enter a num:");

        //creating loop for entering numbers. It will come out when anything else is entered.
        while (scan.hasNextInt()){
            num = scan.nextInt();
            if (num > max) max = num;
            if (num < min) min = num;
        }
        //msg will be printed once the loop stops
        System.out.println("Minimum no was : " + min);
        System.out.println("Maximum no was : " + max);

        //Closing the scanner object
        scan.close();
    }
}
