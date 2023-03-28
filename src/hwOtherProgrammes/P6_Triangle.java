package hwOtherProgrammes;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */
public class P6_Triangle {
    public static void main(String[] args) {

        triangleMethod();

    }
    public static void triangleMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows you want for your Triangle: ");
        int rows = scan.nextInt();

        for (int i = 0; i <= rows; i++){

            for (int n = 1; n <= i; n++) {
                System.out.print(n);
            }
                System.out.println(" ");
            }
        scan.close();
        }
    }

