package hwOtherProgrammes;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */
public class P15_LeftAngleTriangle {
    public static void main(String[] args) {
        leftTriangle();
    }
    public static void leftTriangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows:");
        int r = scan.nextInt();
        for (int i=0; i<r+1 ; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scan.close();
    }
}
