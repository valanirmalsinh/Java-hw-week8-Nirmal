package hwOtherProgrammes;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 *  While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */
public class P14_DiamondLoop {

    public static void main(String[] args) {
        diamond();
    }
    public static void diamond(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows to make half of diamond: ");
        int r= scan.nextInt();
        //top
        for(int i=0;i<=r;i++)//rows
        {
            for(int j=1;j<=r-i;j++)//spaces
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)//stars
                System.out.print("*");
            System.out.print("\n");
        }
        //bottom
        for(int i=r-1;i>=1;i--)//rows
        {
            for(int j=1;j<=r-i;j++)//spaces
                System.out.print(" ");
            for(int j=1;j<=2*i-1;j++)//stars
                System.out.print("*");
            System.out.print("\n");
        }
        scan.close();
    }
}
