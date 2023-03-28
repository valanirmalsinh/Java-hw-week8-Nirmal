package hwOtherProgrammes;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class P10_ArmstrongNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        int num2 = num;
        int temp = 0;
        int total = 0;

        while (num != 0){
            temp = num % 10;
            total = total + temp * temp * temp;
            num = num / 10;
        }
        if (total == num2){
            System.out.println(num2 + " is an Armstrong number");
        }else {
            System.out.println(num2 + " is not an Armstrong number");
        }
        scan.close();
    }
}
