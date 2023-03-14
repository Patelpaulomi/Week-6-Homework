package homeworkwk6;
//8. Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Q8Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width of triangle :");
        double base = scanner.nextDouble();

        System.out.println("enter the high of triangle :");
        double height = scanner.nextDouble();

        //Area = (base * height)/2

        double area = (base * height)/2;
        System.out.println("area of the triangle is : " + area);
        scanner.close();

    }
}
