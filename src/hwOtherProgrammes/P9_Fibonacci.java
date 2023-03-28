package hwOtherProgrammes;
// 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

import java.util.Scanner;

public class P9_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want in the Finonacci sequance :");
        int num = scan.nextInt();
        int one = 0;
        int two = 1;
        for (int i = 0; one <= num; i++) {
            System.out.print(one + " ");
            int sum = one + two;
            one = two;
            two = sum;
        }
        scan.close();
    }
}
