package homeworkwk6;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */

public class Q15SwapTwoVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number1 = ");
        int a = in.nextInt();
        System.out.println("Input number2 = ");
        int b = in.nextInt();
        System.out.println("before swapping =" + a + ";" + b);
        int ab;
        ab = a;
        a = b;
        b = ab;
        System.out.println("after swapping =" + a + ";" + b);
        in.close();

    }
}
