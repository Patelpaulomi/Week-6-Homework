package homeworkwk6;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output:
 *
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Q14PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Width =");
        double W = in.nextDouble();
        System.out.println("Input Height =");
        double H = in.nextDouble();
        System.out.println("Area is = " + W + H);
        System.out.println("Perimeter is =" + 2*(W+H));
        in.close();
    }
}
