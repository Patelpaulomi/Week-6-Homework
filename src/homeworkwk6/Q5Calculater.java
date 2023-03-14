package homeworkwk6;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)

 */
public class Q5Calculater {

    public static void main(String[] args) {

        addition(25, 15);
        substraction(50, 40);
        Q5Calculater obj = new Q5Calculater();
        obj.multiplication(45, 10);
        obj.division(30, 15);

    }

    public static void addition(int a, int b) {
        // int ans = a + b;
        System.out.println("additon of two number is :" + (a + b));

    }

    public static void substraction(int a, int b) {
        int ans = a - b;
        System.out.println("substraction of two number is :" + ans);

    }

    public void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("multiplication of two number is :" + ans);

    }

    public void division(int a, int b) {
        int ans = a / b;
        System.out.println("division of two number is :" + ans);

    }
}

