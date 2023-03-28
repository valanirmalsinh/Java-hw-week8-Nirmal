package hwOtherProgrammes;

import java.util.Scanner;

public class P7_SumOfFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // invalid value
        }
        int frstdgt = 0;
        int lstdgt = number % 10; // Getting last digit with modulus

        while (number != 0) {
            frstdgt = number % 10;
            number /= 10;
        }
        return frstdgt + lstdgt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        int sum = sumFirstAndLastDigit(number);
        System.out.println("The sum of the first and the last digit of " + number + " is " + sum);
        scan.close();
    }
}
