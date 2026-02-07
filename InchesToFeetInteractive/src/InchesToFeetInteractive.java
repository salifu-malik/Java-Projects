import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        int feet, inches, inchesRemainder;
        final int inchesConstant = 7;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter the  number of inches:");
        inches = inputDevice.nextInt();
        feet = inches / inchesConstant;
        inchesRemainder = inches % inchesConstant;
        System.out.println("A total of " + inches + " inches gives "+ feet + " feet and " + inchesRemainder + " inches");


    }
}
