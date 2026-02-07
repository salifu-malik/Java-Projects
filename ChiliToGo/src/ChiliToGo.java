import java.util.Scanner;
public class ChiliToGo {
    public static void main(String[] args) {
        final int  adultMealPrice = 7;
        final int childMealPrice = 4;
        int numberOfAdultMeal, numberOfChileMeal, totalAdultMealPrice, totalChildMealPrice, totalMealPrice;
         Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of adult meal:");
        numberOfAdultMeal = inputDevice.nextInt();
        System.out.println("Enter the number of children meal:");
        numberOfChileMeal = inputDevice.nextInt();
        totalAdultMealPrice = numberOfAdultMeal * adultMealPrice;
        totalChildMealPrice = numberOfChileMeal * childMealPrice;
        totalMealPrice = totalAdultMealPrice + totalChildMealPrice;
        System.out.println("The total meal collected for adult is " +numberOfAdultMeal + " which sums up to $" + totalAdultMealPrice + " at $7 per an adult's meal, where as the total meal collected for children is " +numberOfChileMeal + " which also sums up to $" + totalChildMealPrice +" at $4 per a child's meal and also making a total of $" +totalMealPrice+ ".");


    }

}
