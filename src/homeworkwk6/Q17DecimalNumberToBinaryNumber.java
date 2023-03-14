package homeworkwk6;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 *
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 *
 * Binary number is: 101
 */

public class Q17DecimalNumberToBinaryNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number to convert into binary");
        int a = in.nextInt();
        System.out.println(Integer.toBinaryString(a));
        in.close();

    }
}
