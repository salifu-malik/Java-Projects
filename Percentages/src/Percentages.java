/**
 Create an application named Percentages whose main() method holds
 two double variables. Assign values to the variables. Pass both variables to
 a method named computePercent() that displays the two values and the
 value of the first number as a percentage of the second one. For example, if
 the numbers are 2.0 and 5.0, the method should display a statement similar
 to “2.0 is 40 percent of 5.0.” Then call the method a second time, passing the
 values in reverse order. Save the application as Percentages.java.
 */

public class Percentages {
    public static void main(String[] args) {
         double firstNumber = 2;
        double secondNumber = 5;

        System.out.println("The results is ");
        computePercent(firstNumber, secondNumber);



    }

    public static void computePercent(double firstNumber, double secondNumber){
        System.out.println((firstNumber/secondNumber) * 100 + "%");

    }
}
