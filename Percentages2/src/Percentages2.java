import java.util.Scanner;

public class Percentages2 {
    public  static void computePercentage(double firstNumber, double secondNumber){
        System.out.println((firstNumber/secondNumber) * 100 + "%");

    }


    public static void main(String[] args) {
        double firstNumber, secondNumber;

        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter your first number:");
        firstNumber = inputDevice.nextDouble();

        System.out.println("Enter your second number:");
        secondNumber = inputDevice.nextDouble();

        System.out.println("The percentage of " + firstNumber + " of " +secondNumber + " is :");
        computePercentage(firstNumber, secondNumber);


    }
}
