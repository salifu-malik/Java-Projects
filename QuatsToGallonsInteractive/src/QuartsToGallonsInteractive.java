import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int numberOfQuartsPerGallon = 4;
        int numberOfQuarts, numberOfQGallons, remainderOfQuarts;
Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your number of quarts:");
        numberOfQuarts = inputDevice.nextInt();
        numberOfQGallons = numberOfQuarts / numberOfQuartsPerGallon;
        remainderOfQuarts = numberOfQuarts % numberOfQuartsPerGallon;

        System.out.println("A job that needs "+ numberOfQuarts+ " quarts requires " + numberOfQGallons+ " gallons plus "+remainderOfQuarts+" quarts." );

    }
}
