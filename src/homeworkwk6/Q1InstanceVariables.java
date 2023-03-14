package homeworkwk6;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Q1InstanceVariables {

    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Q1InstanceVariables obj = new Q1InstanceVariables();
        obj.myMethod();
    }
      // Instance Method
    public void myMethod() {


        System.out.println(a);
        System.out.println(b);
    }
}



