/**
 Create an application named NumbersDemo whose main() method holds two
 integer variables. Assign values to the variables. In turn, pass each value to
 methods named displayTwiceTheNumber(), displayNumberPlusFive(), and
 displayNumberSquared(). Create each method to perform the task its name
 implies. Save the application as NumbersDemo.java.
 */

public class NumbersDemo {


    public static void displayTwiceTheNumber(int num1){
        System.out.println(num1 * 2);



    }

    public static void displayNumberPlusFive(int num1){
        System.out.println(num1 + 5);


    }

    public static void displayNumberSquared(int num1){
        System.out.println(num1 *num1);


    }

    public static void main(String[] args) {

        int num1 = 7;

        System.out.println("Results for the are the following:");
        displayNumberSquared(num1);
        displayNumberPlusFive(num1);
        displayTwiceTheNumber(num1);
    }



}
