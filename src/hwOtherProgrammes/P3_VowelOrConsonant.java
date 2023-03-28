package hwOtherProgrammes;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel or Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class P3_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a single character from the alphabet");
        String letter = scan.next().toLowerCase();

        if (letter.length() == 1) {
            if (letter.equals('a') || letter.equals('e') || letter.equals('i') || letter.equals('o') || letter.equals('u')) {
                System.out.println("input is a vowel");

            } else {
                System.out.println("input is a Consonant");

            }
        }else {
            System.out.println("Invalid input. Please enter single character from the alphabet");
        }
        scan.close();
    }
}

