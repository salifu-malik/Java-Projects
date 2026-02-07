import java.util.Scanner;
public class SammyRentalPrice {
    public static void main(String[] args) {

        final int minutesPerHour = 60;
        final int costPerHour = 40;
        final int costPerMinute = 1;
        int nOfMinutes, hour, minutes, hourPrice, minutePrice;


        Scanner inputDevice = new Scanner(System.in);
        System.out.println(" Enter your number of minutes:");
        nOfMinutes = inputDevice.nextInt();

        hour = nOfMinutes / minutesPerHour;
        minutes = nOfMinutes % minutesPerHour;
        hourPrice = hour * costPerHour;
        minutePrice = minutes * costPerMinute;


        System.out.println("You entered "+ nOfMinutes+ " minutes.\nYou have "+ hour + " hours at a cost of $40 per hour and "+ minutes + " minutes at a cost of $1 per minute. \nTherefore your total cost for hours and minutes respectively are $"+hourPrice+ " and $"+ minutePrice+ ".");

    }
}
