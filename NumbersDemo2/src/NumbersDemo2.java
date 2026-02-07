import java.util.Scanner;


public class NumbersDemo2 {
    public static void main(String[] args) {
        int number;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter your number:");
        number = inputDevice.nextInt();

        displaySquaredNumber(number);
        displayNumberPlusFive(number);
        displayTwiceTheNumber(number);

    }



    public static void displaySquaredNumber(int number){
        System.out.println("The square of  the the number " +number+ " is "+number * number);
    }


    public static void displayNumberPlusFive(int number){
        System.out.println("The addition of 5 to the number " +number+ " is "+(number + 5));

    }

    public static void displayTwiceTheNumber(int number){
        System.out.println("The twice of  the the number " +number+ " is "+number * 2);

    }


}
