package homeworkwk6;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Q7Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input temperature in Fahrenheit :");
        float fahrenheit = input.nextFloat();
      float celsius = (fahrenheit - 32) * 5 /9 ;
        System.out.println(fahrenheit + "degree fahreheit is "+ celsius + "in celsius");
        input.close();

    }

}
