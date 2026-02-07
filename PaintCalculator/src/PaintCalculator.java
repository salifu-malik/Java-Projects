/**
 Assume that a gallon of paint covers about 350 square feet of wall space. Create
 an application with a main() method that prompts the user for the length, width,
 and height of a rectangular room. Pass these three values to a method that does
 the following:
 • Calculates the wall area for a room
 • Passes the calculated wall area to another method that calculates and returns
 the number of gallons of paint needed
 • Displays the number of gallons needed
 • Computes the price based on a paint price of $32 per gallon, assuming that
 the painter can buy any fraction of a gallon of paint at the same price as a
 whole gallon
 • Returns the price to the main() method
 The main() method displays the final price. For example, the cost to paint
 a 15-by-20-foot room with 10-foot ceilings is $64. Save the application as
 PaintCalculator.java.
 */
import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);


        System.out.println("Enter the length of the room (in feet): ");
        double length = inputDevice.nextDouble();

        System.out.println("Enter the width of the room (in feet): ");
        double width = inputDevice.nextDouble();

        System.out.println("Enter the height of the room (in feet): ");
        double height = inputDevice.nextDouble();

        // Call the method to calculate total cost
        double totalPrice = calculatePaintCost(length, width, height);

        // Display final price
        System.out.printf("Total cost to paint the room: $%.2f\n", totalPrice);
    }

    // This method calculates wall area and delegates further
    public static double calculatePaintCost(double length, double width, double height) {
        double wallArea = calculateWallArea(length, width, height);
        double price = computeGallonsAndPrice(wallArea);
        return price;
    }

    // Method to calculate the wall area of the room
    public static double calculateWallArea(double length, double width, double height) {
        double area = height * length * width;
        System.out.printf("Total wall area: %.2f square feet\n", area);
        return area;
    }

    // Method to calculate gallons needed and compute price
    public static double computeGallonsAndPrice(double wallArea) {
        final double COVERAGE_PER_GALLON = 350.0;
        final double PRICE_PER_GALLON = 32.0;

        double gallonsNeeded = wallArea / COVERAGE_PER_GALLON;

        System.out.printf("Gallons of paint needed: %.2f gallons\n", gallonsNeeded);

        double price = gallonsNeeded * PRICE_PER_GALLON;

        System.out.printf("Price for painting: $%.2f\n", price);

        return price;
    }
}
