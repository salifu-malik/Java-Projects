/**
 Herbert’s Home Repair estimates each job cost as the cost of materials plus $35
 per hour while on the job, plus $12 per hour for travel time to the job site. Create
 a class that contains a main() method that prompts the user for the name of a
 job (for example, Smith bathroom remodel), the cost of materials, the number of
 hours of work required, and the number of hours travel time. Pass the numeric
 data to a method that computes estimate for the job and returns the computed
 value to the main() method where the job name and estimated price are
 displayed. Save the program as JobPricing.java.
 */

import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
       final double priceOnJobPerHour = 35.0;
       final double priceOnTravelPerHour = 12.0;
       String nameOfJob;
       double materialCost, noHoursOfWorked, noHoursOfTravelTime;
        Scanner inputDevice = new Scanner(System.in);


        System.out.println("Enter the name of job:");
        nameOfJob = inputDevice.nextLine();

        System.out.println("Enter the cost of the material:");
        materialCost = inputDevice.nextDouble();

        System.out.println("Enter the number of hours of worked required:");
        noHoursOfWorked = inputDevice.nextDouble();

        System.out.println("Enter the number of hours of travel time required: ");
        noHoursOfTravelTime = inputDevice.nextDouble();

        System.out.println(nameOfJob);
        jobEstimate( priceOnJobPerHour, priceOnTravelPerHour, materialCost, noHoursOfWorked, noHoursOfTravelTime);



        }

    public static void jobEstimate(double priceOnJobPerHour, double priceOnTravelPerHour, double materialCost, double noHoursOfWorked, double noHoursOfTravelTime){
        double mymaterialCost = materialCost + (priceOnJobPerHour * noHoursOfWorked) + (priceOnTravelPerHour * noHoursOfTravelTime);

        System.out.println("The cost of the material is $" + mymaterialCost);

        System.out.println();

    }
}
