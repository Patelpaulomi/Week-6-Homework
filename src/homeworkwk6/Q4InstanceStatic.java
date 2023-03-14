package homeworkwk6;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Q4InstanceStatic {

    static String a = "London";
    static String b = "  Ahmedabad";
    String x = "Harrow";
    String y = "  Naranpura";


    public static void main(String[] args) {

        myCity();
        Q4InstanceStatic obj = new Q4InstanceStatic();
        obj.myTown();

    }

    public static void myCity() {
        System.out.println(a);
        System.out.println(b);
        Q4InstanceStatic obj = new Q4InstanceStatic();
        System.out.println(obj.x);
        System.out.println(obj.y);


    }

    public void myTown() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);


    }
}
