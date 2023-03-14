package homeworkwk6;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Q13AvergeOfTheNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input the first number:");
        double x = in.nextDouble();
        System.out.println("input the second number");
        double y = in.nextDouble();
        System.out.println("input the third number");
        double z = in.nextDouble();
        System.out.println("the average value is " + (x+y+z)/3);

        in.close();
    }
}
