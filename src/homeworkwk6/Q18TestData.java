package homeworkwk6;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Q18TestData {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number 1 =");
        int a = in.nextInt();
        System.out.println("Input number 2 =");
        int b = in.nextInt();
        System.out.println("125 + 24 ="+ (a+b));
        System.out.println("125 - 24 ="+ (a-b));
        System.out.println("125 x 24 =" + (a*b));
        System.out.println("125 / 24 =" + (a/b));
        System.out.println("125 mod 24 ="+ (a%b));

        in.close();
    }
}
