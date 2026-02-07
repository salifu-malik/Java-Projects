import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args) {
        final int minutes = 60;
        final int hours = 24;
        int numberOfMinutes, numberOfHours, numberOfDays;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        numberOfMinutes = inputDevice.nextInt();
        numberOfHours = numberOfMinutes / minutes;
        numberOfDays = numberOfMinutes / (minutes * hours);

        System.out.println(numberOfMinutes + " gives you "+numberOfHours+ " hours " + numberOfDays + " days.");


    }
}
