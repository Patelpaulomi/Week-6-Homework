package homeworkwk6;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */


public class Q3InstanceAndStatic {
    public static void main(String[] args) {
        division();
        Q3InstanceAndStatic obj = new Q3InstanceAndStatic();
        obj.multiplication();

    }

    public static void division() {
        int a = 20;
        int b = 5;
        int ans = a / b;
        System.out.println("division of two number is :" + ans);

    }

    public void multiplication() {
        int a = 15;
        int b = 10;
        int ans = a * b;
        System.out.println("multiplication of two number is :" + ans);
    }
}
