package homeworkwk6;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Q6RadiusValue {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double radius = 0.0;
        System.out.println("enter the radius of circle");
        //next double method reads user imput and assign variable
        radius=Scanner.nextDouble();
        double area = 0.0;
        System.out.println("radius enter by user");
        //area of circle = 22/7 * radius * radius
        area = Math.PI * radius;
        System.out.println("Area of circle is :" + area);
        //circumference = 2 * Math.PI* radius;

        Scanner.close();
    }
}
