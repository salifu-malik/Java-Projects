import java.util.Scanner;

     void main() {
        final int numberOfQuartsPerGallon = 4;
        int numberOfQuarts, numberOfQGallons, remainderOfQuarts;
        Scanner inputDevice = new Scanner(System.in);
        IO.println("Please enter your number of quarts:");
        numberOfQuarts = inputDevice.nextInt();
        numberOfQGallons = numberOfQuarts / numberOfQuartsPerGallon;
        remainderOfQuarts = numberOfQuarts % numberOfQuartsPerGallon;

        IO.println("A job that needs "+ numberOfQuarts+ " quarts requires " + numberOfQGallons+ " gallons plus "+remainderOfQuarts+" quarts." );

    }

